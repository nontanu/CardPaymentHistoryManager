package jp.co.niconiconi.cardapp.service;

import org.springframework.mock.web.MockHttpSession;

import jp.co.niconiconi.cardapp.Interactor.CardInteractor;
import jp.co.niconiconi.cardapp.data.entity.Card;

public class CardRegistrationServiceTest {
    private final CardRegistrationService cardRegistrationService;

    public CardRegistrationServiceTest() {
        this.cardRegistrationService = new CardRegistrationService(new MockHttpSession(), new MockCardInteractor());
    }

    public void testRegisterCard() {
        cardRegistrationService.registerCard("testName", "testCompany", "testBrand");
    }

    private class MockCardInteractor implements CardInteractor {

        @Override
        public void registerCard(Card card) {
        }

        @Override
        public Card newCard(String name, int userId, String company, String brand) {
            return null;
        }

        @Override
        public jp.co.niconiconi.cardapp.domain.model.Card newCardModel(Card card, int userId) {
            return new jp.co.niconiconi.cardapp.domain.model.Card("aabbbcccddddd", 1, "test", "testCompany", "testBrand");
        }

    }
}
