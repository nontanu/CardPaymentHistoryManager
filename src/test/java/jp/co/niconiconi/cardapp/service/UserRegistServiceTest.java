package jp.co.niconiconi.cardapp.service;

import org.junit.jupiter.api.Test;

import jp.co.niconiconi.cardapp.Interactor.UserInteractor;

public class UserRegistServiceTest {
    private final UserRegistService userRegistService;

    public UserRegistServiceTest() {
        this.userRegistService = new UserRegistService(new MockUserInteractor());
    }

    @Test
    public void testRegistLoginUser() {
        userRegistService.registLoginUser("test", "test");
    }

    private class MockUserInteractor implements UserInteractor {

        @Override
        public void save(String userId, String password) {
        }

    }
}
