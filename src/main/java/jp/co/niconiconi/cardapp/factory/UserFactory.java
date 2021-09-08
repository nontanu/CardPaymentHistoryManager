package jp.co.niconiconi.cardapp.factory;

import jp.co.niconiconi.cardapp.model.User;

abstract public class UserFactory {
	abstract public User create(String userId);
}
