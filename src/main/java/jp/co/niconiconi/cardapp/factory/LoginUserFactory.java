package jp.co.niconiconi.cardapp.factory;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import jp.co.niconiconi.cardapp.data.repository.LoginUserRepository;
import jp.co.niconiconi.cardapp.model.LoginUser;
import jp.co.niconiconi.cardapp.model.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class LoginUserFactory extends UserFactory {

	@NonNull
	private final LoginUserRepository loginUserRepository;

	public User create(String userId) {
		return newLoginUser(userId);
	}

	private User newLoginUser(String userId) {
		jp.co.niconiconi.cardapp.data.entity.LoginUser loginUserEntity = getLoginUserEntity(userId);
		LoginUser loginUser = new LoginUser(
				loginUserEntity);
		return loginUser;
	}

	private jp.co.niconiconi.cardapp.data.entity.LoginUser getLoginUserEntity(String userId) {
		// 渡されたIDをキーにユーザ情報取得
		jp.co.niconiconi.cardapp.data.entity.LoginUser loginUserEntity = loginUserRepository.findByUserId(userId)
				.orElseThrow(() -> new UsernameNotFoundException("ユーザーが登録されていません。"));
		return loginUserEntity;
	}

}
