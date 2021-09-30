package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CardListContorollerTest {

	private final CardListContoroller cardlistController;

	private static final String PAGE_CARD_LIST = "cardlist/index";

	public CardListContorollerTest() {
		this.cardlistController = new CardListContoroller();
	}

	@Test
	public void index() {
		assertEquals(PAGE_CARD_LIST, cardlistController.index());
	}

}
