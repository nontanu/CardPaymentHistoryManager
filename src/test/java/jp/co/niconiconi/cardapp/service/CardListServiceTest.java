package jp.co.niconiconi.cardapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.mock.web.MockHttpSession;

import jp.co.niconiconi.cardapp.model.Card;

public class CardListServiceTest {

	private CardListService cardListService;

	private final HttpSession session = new MockHttpSession();

	public CardListServiceTest() {
		this.cardListService = new CardListService(session);
	}

	public void testGetCardList() {
		List<Card> cardList = new ArrayList<>();
		assertEquals(cardList, cardListService.getCardList());
	}
}
