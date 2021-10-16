package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.niconiconi.cardapp.constants.ReturnUrls;

public class LoginControllerTest {

    private final LoginController loginController;

    public LoginControllerTest() {
        this.loginController = new LoginController();
    }

    @Test
    public void testLogin() {
        assertEquals(ReturnUrls.PAGE_LOGIN.getUrl(), loginController.login(null));
    }

}
