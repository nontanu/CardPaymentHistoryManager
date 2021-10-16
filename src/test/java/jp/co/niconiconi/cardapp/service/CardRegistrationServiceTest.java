package jp.co.niconiconi.cardapp.service;

import org.springframework.mock.web.MockHttpSession;

public class CardRegistrationServiceTest {
    private final CardRegistrationService cardRegistrationService;

    public CardRegistrationServiceTest() {
        this.cardRegistrationService = new CardRegistrationService(new MockHttpSession());
    }

    public void testRegisterCard() {
        cardRegistrationService.registerCard("testName", "testCompany", "testBrand");
    }
}
