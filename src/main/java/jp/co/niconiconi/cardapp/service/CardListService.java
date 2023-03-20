package jp.co.niconiconi.cardapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import jp.co.niconiconi.cardapp.constants.SessionNames;
import jp.co.niconiconi.cardapp.domain.model.Card;
import jp.co.niconiconi.cardapp.domain.model.LoginUser;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CardListService {
    @NonNull
    private final HttpSession session;

    public List<Card> getCardList() {
        LoginUser loginUser = (LoginUser) session.getAttribute(SessionNames.LOGIN_USER.getName());
        List<Card> cardList = new ArrayList<>();
        if (loginUser != null) {
            cardList = loginUser.getCardList();
        }
        return cardList;
    }

}
