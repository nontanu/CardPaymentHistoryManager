package jp.co.niconiconi.cardapp.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import jp.co.niconiconi.cardapp.factory.LoginUserFactory;
import jp.co.niconiconi.cardapp.model.UserDetail;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class AuthUserService implements UserDetailsService {

	@NonNull
	private final LoginUserFactory loginUserFactory;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		// 入力値が空の場合もあるため、予めチェックしておく。（DBFluteの場合、事前にチェック必須。）
		ifUserNullThrowNotFoundException(userId);

		jp.co.niconiconi.cardapp.model.LoginUser user = loginUserFactory.createLoginUser(userId);
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
