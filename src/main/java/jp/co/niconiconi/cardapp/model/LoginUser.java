package jp.co.niconiconi.cardapp.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.niconiconi.cardapp.Interactor.CardInteractor;

public class LoginUser extends User {

    private final CardInteractor cardInteractor;

    private String password;

    private List<Card> cardLIst;

    public LoginUser(Integer id, String userId, String name, String password, List<Card> cardList,
            @Autowired CardInteractor cardInteractor) {
        super(id, userId, name);
        this.password = password;
        this.cardLIst = cardList;
        this.cardInteractor = cardInteractor;
    }

    @Override
    public Optional<String> getPassword() {
        return Optional.of(password);
    }

    @Override
    public List<Card> getCardList() {
        return cardLIst;
    }

    @Override
    public void registCard(String cardName, String cardCompany, String cardBrand) {
        Card card = cardInteractor.registerCard(cardName, cardCompany, cardBrand, getId());
        getCardList().add(card);
    }

}
