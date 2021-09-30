package jp.co.niconiconi.cardapp.factory;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import jp.co.niconiconi.cardapp.data.entity.LoginUser;
import jp.co.niconiconi.cardapp.data.repository.LoginUserRepository;
import jp.co.niconiconi.cardapp.model.User;

public class LoginUserFactoryTest {

	private final LoginUserFactory loginUserFactoryImpl;

	public LoginUserFactoryTest() {
		this.loginUserFactoryImpl = new LoginUserFactory(new  MockLoginUserRepository());
	}

	@Test
	public void create() {
		User user = loginUserFactoryImpl.create(null);
	}

	private class MockLoginUserRepository implements LoginUserRepository {

		@Override
		public <S extends LoginUser> S save(S entity) {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

		@Override
		public <S extends LoginUser> Iterable<S> saveAll(Iterable<S> entities) {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

		@Override
		public Optional<LoginUser> findById(Integer id) {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

		@Override
		public boolean existsById(Integer id) {
			// TODO 自動生成されたメソッド・スタブ
			return false;
		}

		@Override
		public Iterable<LoginUser> findAll() {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

		@Override
		public Iterable<LoginUser> findAllById(Iterable<Integer> ids) {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

		@Override
		public long count() {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
		}

		@Override
		public void deleteById(Integer id) {
			// TODO 自動生成されたメソッド・スタブ

		}

		@Override
		public void delete(LoginUser entity) {
			// TODO 自動生成されたメソッド・スタブ

		}

		@Override
		public void deleteAll(Iterable<? extends LoginUser> entities) {
			// TODO 自動生成されたメソッド・スタブ

		}

		@Override
		public void deleteAll() {
			// TODO 自動生成されたメソッド・スタブ

		}

		@Override
		public Optional<LoginUser> findByUserId(String userId) {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

	}
}
