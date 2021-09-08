package jp.co.niconiconi.cardapp.model;

public class LoginUser extends User {

	private String password;

	public LoginUser(jp.co.niconiconi.cardapp.data.entity.LoginUser loginUserEntity) {
		super(loginUserEntity.getId(), loginUserEntity.getUserId(), loginUserEntity.getName());
		this.password = loginUserEntity.getPassword();
	}

	public String getPassword() {
		return password;
	}

}
