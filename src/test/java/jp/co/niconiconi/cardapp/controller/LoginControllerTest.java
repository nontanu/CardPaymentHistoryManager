package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LoginControllerTest {

	private final LoginController loginController;

	private static final String PAGE_LOGIN = "login/Login";

	public LoginControllerTest() {
		this.loginController = new LoginController();
	}

	@Test
	public void login() {
		assertEquals(PAGE_LOGIN, loginController.login(null));
	}

}
