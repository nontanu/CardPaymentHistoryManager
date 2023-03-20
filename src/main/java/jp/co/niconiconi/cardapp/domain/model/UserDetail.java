package jp.co.niconiconi.cardapp.domain.model;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;

public class UserDetail extends User {

	public UserDetail(jp.co.niconiconi.cardapp.domain.model.User user) {
		super(user.getUserId(), user.getPassword().orElse(null), Collections.emptyList());
	}

}
