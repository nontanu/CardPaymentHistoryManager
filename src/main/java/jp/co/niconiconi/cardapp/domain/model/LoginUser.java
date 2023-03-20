package jp.co.niconiconi.cardapp.domain.model;

import java.util.List;
import java.util.Optional;

public class LoginUser extends User {

    private String password;

    private List<Card> cardLIst;

    public LoginUser(Integer id, String userId, String name, String password, List<Card> cardList) {
        super(id, userId, name);
        this.password = password;
        this.cardLIst = cardList;
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
    public void registCard(Card card) {
        getCardList().add(card);
    }

}
