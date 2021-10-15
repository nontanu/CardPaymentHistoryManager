package jp.co.niconiconi.cardapp.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CardRegistControllerTest {
    private static final String PAGE_CARD_REGIST = "cardregist/index";

    private final CardRegistController cardRegistController;

    public CardRegistControllerTest() {
        this.cardRegistController = new CardRegistController();
    }

    @Test
    public void testIndexReturnStr() {
        assertEquals(PAGE_CARD_REGIST, cardRegistController.index());
    }
}
