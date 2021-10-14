package jp.co.niconiconi.cardapp.factory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.co.niconiconi.cardapp.data.entity.Card;
import jp.co.niconiconi.cardapp.data.entity.LoginUser;
import jp.co.niconiconi.cardapp.data.repository.CardRepository;
import jp.co.niconiconi.cardapp.data.repository.LoginUserRepository;

public class LoginUserFactoryTest {

    private static final String ACTUAL_USER_ID = "testUserId";

    private final LoginUserFactory loginUserFactoryImpl;

    private final HttpSession session = new MockHttpSession();

    public LoginUserFactoryTest() {
        this.loginUserFactoryImpl = new LoginUserFactory(new MockLoginUserRepository(), new MockCardRepository(),
                session);
    }

    @Test
    public void testUserNotFound() {
        assertThrows(UsernameNotFoundException.class, () -> loginUserFactoryImpl.create(null));
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
            if (ACTUAL_USER_ID.equals(userId)) {
                return Optional.of(new LoginUser());
            } else {
                return Optional.ofNullable(null);
            }
        }

    }

    private class MockCardRepository implements CardRepository {

        @Override
        public <S extends Card> S save(S entity) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public <S extends Card> Iterable<S> saveAll(Iterable<S> entities) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Optional<Card> findById(String id) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public boolean existsById(String id) {
            // TODO 自動生成されたメソッド・スタブ
            return false;
        }

        @Override
        public Iterable<Card> findAll() {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public Iterable<Card> findAllById(Iterable<String> ids) {
            // TODO 自動生成されたメソッド・スタブ
            return null;
        }

        @Override
        public long count() {
            // TODO 自動生成されたメソッド・スタブ
            return 0;
        }

        @Override
        public void deleteById(String id) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void delete(Card entity) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void deleteAll(Iterable<? extends Card> entities) {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public void deleteAll() {
            // TODO 自動生成されたメソッド・スタブ

        }

        @Override
        public List<Card> findByUserId(int userId) {
            List<Card> cardList = new ArrayList<>();
            return cardList;
        }

    }
}
