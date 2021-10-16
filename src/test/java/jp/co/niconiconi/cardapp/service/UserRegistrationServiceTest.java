package jp.co.niconiconi.cardapp.service;

import org.junit.jupiter.api.Test;

import jp.co.niconiconi.cardapp.Interactor.UserInteractor;

public class UserRegistrationServiceTest {
    private final UserRegistrationService userRegistService;

    public UserRegistrationServiceTest() {
        this.userRegistService = new UserRegistrationService(new MockUserInteractor());
    }

    @Test
    public void testRegistLoginUser() {
        userRegistService.registerLoginUser("test", "test");
    }

    private class MockUserInteractor implements UserInteractor {

        @Override
        public void registerLoginUser(String userId, String password) {
        }
    }
}
