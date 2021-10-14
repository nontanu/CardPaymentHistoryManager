package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpSession;

import jp.co.niconiconi.cardapp.model.Card;
import jp.co.niconiconi.cardapp.service.CardListService;

public class CardListContorollerTest {

	private final CardListContoroller cardlistController;

	private static final String PAGE_CARD_LIST = "cardlist/index";

	private final HttpSession session = new MockHttpSession();

	public CardListContorollerTest() {
		this.cardlistController = new CardListContoroller(
				new CardListService(session));
	}

	@Test
	public void testIndexReturnStr() {
		assertEquals(PAGE_CARD_LIST, cardlistController.index());
	}

	@Test
	public void testList() {
		List<Card> actualCardList = new ArrayList<>();
		assertEquals(actualCardList, cardlistController.list());
	}

}
