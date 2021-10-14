package jp.co.niconiconi.cardapp.model;

public class Card {
	private String id;
	private String userId;
	private String name;
	private String company;
	private String brand;

	public Card(String id, String userId, String name, String company, String brand) {
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.company = company;
		this.brand = brand;
	}

	public String getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getBrand() {
		return brand;
	}
}
