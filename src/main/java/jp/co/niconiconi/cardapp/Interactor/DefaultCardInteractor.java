package jp.co.niconiconi.cardapp.Interactor;

import java.util.UUID;

import org.springframework.stereotype.Component;

import jp.co.niconiconi.cardapp.data.entity.Card;
import jp.co.niconiconi.cardapp.data.repository.CardRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * カードインタラクター.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Component
public class DefaultCardInteractor implements CardInteractor {
    @NonNull
    private final CardRepository cardRepository;

    @Override
    public jp.co.niconiconi.cardapp.model.Card registerCard(String name, String company, String brand,
            int userId) {
        Card card = newCard(name, userId, company, brand);
        cardRepository.save(card);
        return newCardModel(card, userId);
    }

    /**
     * カードエンティティを作成する.
     * @param name
     * @param company
     * @param brand
     * @return Card(エンティティ)
     */
    private Card newCard(String name, int userId, String company, String brand) {
        Card card = new Card();
        card.setId(UUID.randomUUID().toString());
        card.setUserId(userId);
        card.setName(name);
        card.setCompany(company);
        card.setBrand(brand);
        return card;
    }

    /**
     * カードモデルを作成する.
     * @param card
     * @param userId
     * @return Card(モデル)
     */
    private jp.co.niconiconi.cardapp.model.Card newCardModel(Card card, int userId) {
        jp.co.niconiconi.cardapp.model.Card cardModel = new jp.co.niconiconi.cardapp.model.Card(card.getId(), userId,
                card.getName(), card.getCompany(), card.getBrand());
        return cardModel;
    }
}
