package jp.co.niconiconi.cardapp.factory;

import jp.co.niconiconi.cardapp.model.LoginUser;

public interface LoginUserFactory {
	public LoginUser createLoginUser(String userId);
}
