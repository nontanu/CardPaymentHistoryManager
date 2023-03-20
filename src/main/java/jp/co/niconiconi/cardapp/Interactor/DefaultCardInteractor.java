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
    public void registerCard(Card card) {
        cardRepository.save(card);
    }

    /**
     * カードエンティティを作成する.
     * @param name
     * @param company
     * @param brand
     * @return Card(エンティティ)
     */
    public Card newCard(String name, int userId, String company, String brand) {
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
    public jp.co.niconiconi.cardapp.domain.model.Card newCardModel(Card card, int userId) {
        jp.co.niconiconi.cardapp.domain.model.Card cardModel = new jp.co.niconiconi.cardapp.domain.model.Card(card.getId(), userId,
                card.getName(), card.getCompany(), card.getBrand());
        return cardModel;
    }
}
