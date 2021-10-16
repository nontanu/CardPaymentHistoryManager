package jp.co.niconiconi.cardapp.Interactor;

import jp.co.niconiconi.cardapp.model.Card;

public interface CardInteractor {
    /**
     * カードを登録する.
     * @param name
     * @param company
     * @param brand
     * @param userId
     * @return Card(モデル)
     */
    public Card registerCard(String name, String company, String brand, int userId);
}
