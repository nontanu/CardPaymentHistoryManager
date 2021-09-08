package jp.co.niconiconi.cardapp.model;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;

public class UserDetail extends User {

	public UserDetail(LoginUser loginUser) {
		super(loginUser.getUserId(), loginUser.getPassword(), Collections.emptyList());
	}

}
