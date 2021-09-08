package jp.co.niconiconi.cardapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.co.niconiconi.cardapp.data.entity.LoginUser;
import jp.co.niconiconi.cardapp.factory.LoginUserFactory;

public class AuthUserServiceTest {

	private AuthUserService authUserService;

	public AuthUserServiceTest() {
		this.authUserService = new AuthUserService(new mockLoginUserFactory());
	}

	@Test
	public void loadUserByUsernameUserNotFound() {
		assertThrows(UsernameNotFoundException.class, () -> authUserService.loadUserByUsername(null));
	}

	@Test
	public void loadUserByUsernameUserFound() {
		UserDetails user = authUserService.loadUserByUsername("existUserId");
		assertNotNull(user);
	}

	private class mockLoginUserFactory implements LoginUserFactory {

		@Override
		public jp.co.niconiconi.cardapp.model.LoginUser createLoginUser(String userId) {
			// TODO 自動生成されたメソッド・スタブ
			return getLoginUserIfNotMatchIdReturnNull(userId, "existUserId");
		}

		private jp.co.niconiconi.cardapp.model.LoginUser getLoginUserIfNotMatchIdReturnNull(String id, String expect) {
			if (expect.equals(id)) {
				return newUser(id);
			} else {
				return null;
			}
		}

		private jp.co.niconiconi.cardapp.model.LoginUser newUser(String userId) {
			LoginUser user = new LoginUser();
			user.setId(1);
			user.setUserId(userId);
			user.setPassword("test");
			user.setName("test");
			return new jp.co.niconiconi.cardapp.model.LoginUser(user);
		}

	}

}
