package jp.co.niconiconi.cardapp.model;

public class User {
	private Integer id;
	private String userId;
	private String name;

	public User(Integer id, String userId, String name) {
		this.id = id;
		this.userId = userId;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return name;
	}
}
