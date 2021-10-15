package jp.co.niconiconi.cardapp.Interactor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import jp.co.niconiconi.cardapp.data.entity.LoginUser;
import jp.co.niconiconi.cardapp.data.repository.LoginUserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * ログインユーザーテーブル用のインタラクター.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Component
public class LoginUserInteractor implements UserInteractor{

    @NonNull
    private final LoginUserRepository loginUserRepository;

    @Qualifier("BCryptPasswordEncoder")
    private final PasswordEncoder passwordEncoder;

    @Override
    public void save(String userId, String password) {
        LoginUser loginUser = newLoginUser(userId, password);
        loginUserRepository.save(loginUser);
    }

    private LoginUser newLoginUser(String userId, String password) {
        LoginUser loginUser = new LoginUser();
        loginUser.setId(0);
        loginUser.setUserId(userId);
        String encPassword = passwordEncoder.encode(password);
        loginUser.setPassword(encPassword);
        return loginUser;
    }

}
