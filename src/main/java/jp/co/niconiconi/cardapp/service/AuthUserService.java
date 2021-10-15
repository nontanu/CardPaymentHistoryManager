package jp.co.niconiconi.cardapp.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import jp.co.niconiconi.cardapp.factory.UserFactory;
import jp.co.niconiconi.cardapp.model.User;
import jp.co.niconiconi.cardapp.model.UserDetail;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthUserService implements UserDetailsService {

    @NonNull
    private final UserFactory loginUserFactory;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        // 入力値が空の場合もあるため、予めチェックしておく。（DBFluteの場合、事前にチェック必須。）
        ifUserNullThrowNotFoundException(userId);

        User user = loginUserFactory.create(userId);
        return new UserDetail(user);
    }

    private void ifUserNullThrowNotFoundException(String userId) {
        if (ObjectUtils.isEmpty(userId)) {
            // UsernameNotFoundExceptionにメッセージを渡しても画面に反映されないので、
            // ここでは適当に空文字を入れておく
            throw new UsernameNotFoundException("");
        }
    }

}
