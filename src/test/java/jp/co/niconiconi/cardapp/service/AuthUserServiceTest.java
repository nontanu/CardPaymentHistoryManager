package jp.co.niconiconi.cardapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.co.niconiconi.cardapp.data.entity.LoginUser;
import jp.co.niconiconi.cardapp.factory.UserFactory;
import jp.co.niconiconi.cardapp.model.Card;
import jp.co.niconiconi.cardapp.model.User;

public class AuthUserServiceTest {

	private final AuthUserService authUserService;

	public AuthUserServiceTest() {
		this.authUserService = new AuthUserService(new mockLoginUserFactory());
	}

	@Test
	public void loadUserByUsernameWhenUserNotFound() {
		assertThrows(UsernameNotFoundException.class, () -> authUserService.loadUserByUsername(null));
	}

	@Test
	public void loadUserByUsernameWhenUserFound() {
		UserDetails user = authUserService.loadUserByUsername("existUserId");
		assertNotNull(user);
	}

	private class mockLoginUserFactory extends UserFactory {

		@Override
		public User create(String userId) {
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
			List<Card> cardList = new ArrayList<>();
			return new jp.co.niconiconi.cardapp.model.LoginUser(user.getId(), user.getUserId(), user.getName(),
					user.getPassword(), cardList);
		}

	}

}
