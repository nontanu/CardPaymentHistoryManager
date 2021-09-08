package jp.co.niconiconi.cardapp.factory;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import jp.co.niconiconi.cardapp.data.entity.LoginUser;
import jp.co.niconiconi.cardapp.data.repository.LoginUserRepository;
import jp.co.niconiconi.cardapp.model.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class LoginUserFactoryImpl extends UserFactory implements LoginUserFactory {

	@NonNull
	private final LoginUserRepository loginUserRepository;

	@Override
	public User create(String userId) {
		return newUser(userId);
	}

	public jp.co.niconiconi.cardapp.model.LoginUser createLoginUser(String userId) {
		return newLoginUser(userId);
	}

	private User newUser(String userId) {
		LoginUser loginUserEntity = getLoginUserEntity(userId);
		User user = new User(loginUserEntity.getId(), loginUserEntity.getUserId(), loginUserEntity.getName());
		return user;
	}

	private jp.co.niconiconi.cardapp.model.LoginUser newLoginUser(String userId) {
		LoginUser loginUserEntity = getLoginUserEntity(userId);
		jp.co.niconiconi.cardapp.model.LoginUser loginUser = new jp.co.niconiconi.cardapp.model.LoginUser(
				loginUserEntity);
		return loginUser;
	}

	private LoginUser getLoginUserEntity(String userId) {
		// 渡されたIDをキーにユーザ情報取得
		LoginUser loginUserEntity = loginUserRepository.findByUserId(userId)
				.orElseThrow(() -> new UsernameNotFoundException("ユーザーが登録されていません。"));
		return loginUserEntity;
	}

}
