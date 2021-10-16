package jp.co.niconiconi.cardapp.Interactor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import jp.co.niconiconi.cardapp.data.entity.Card;
import jp.co.niconiconi.cardapp.data.repository.CardRepository;

public class CardInteractorTest {
    private final CardInteractor cardInteractor;

    public CardInteractorTest() {
        this.cardInteractor = new DefaultCardInteractor(new MockCardRepository());
    }

    @Test
    public void testRegistCard() {
        jp.co.niconiconi.cardapp.model.Card expect = new jp.co.niconiconi.cardapp.model.Card("testId", 1,
                "testCardName", "testCardCompany", "testCardBrand");
        jp.co.niconiconi.cardapp.model.Card actual = cardInteractor.registerCard("testCardName", "testCardCompany",
                "testCardBrand", 1);
        assertEquals(expect.getUserId(), actual.getUserId());
        assertEquals(expect.getName(), actual.getName());
        assertEquals(expect.getCompany(), actual.getCompany());
        assertEquals(expect.getBrand(), actual.getBrand());
    }

    private class MockCardRepository implements CardRepository {

        @Override
        public <S extends Card> S save(S entity) {
            return null;
        }

        @Override
        public <S extends Card> Iterable<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public Optional<Card> findById(String id) {
            return null;
        }

        @Override
        public boolean existsById(String id) {
            return false;
        }

        @Override
        public Iterable<Card> findAll() {
            return null;
        }

        @Override
        public Iterable<Card> findAllById(Iterable<String> ids) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(String id) {
        }

        @Override
        public void delete(Card entity) {
        }

        @Override
        public void deleteAll(Iterable<? extends Card> entities) {
        }

        @Override
        public void deleteAll() {
        }

        @Override
        public List<Card> findByUserId(int userId) {
            return null;
        }

    }
}
