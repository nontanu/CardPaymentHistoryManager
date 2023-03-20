package jp.co.niconiconi.cardapp.domain.model;

public class Card {
	private String id;
	private int userId;
	private String name;
	private String company;
	private String brand;

	public Card(String id, int userId, String name, String company, String brand) {
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.company = company;
		this.brand = brand;
	}

	public String getId() {
		return id;
	}

	public int getUserId() {
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
