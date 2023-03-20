package jp.co.niconiconi.cardapp.Interactor;

import jp.co.niconiconi.cardapp.data.entity.Card;

public interface CardInteractor {
    /**
     * カードを登録する.
     * @param card
     */
    public void registerCard(Card card);

    /**
     * カードエンティティ作成
     * @param name
     * @param userId
     * @param company
     * @param brand
     * @return
     */
    public Card newCard(String name, int userId, String company, String brand);

    /**
     * カードモデル作成
     * @param card
     * @param userId
     * @return
     */
    public jp.co.niconiconi.cardapp.domain.model.Card newCardModel(Card card, int userId);
}
