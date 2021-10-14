package jp.co.niconiconi.cardapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.niconiconi.cardapp.model.Card;
import jp.co.niconiconi.cardapp.service.CardListService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * カード一覧コントローラー.
 * カード一覧画面の表示およびカード一覧を返却する.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Controller
public class CardListContoroller {

    private static final String PAGE_CARD_LIST = "cardlist/index";

    @NonNull
    private final CardListService cardListService;

    @RequestMapping("/cardlist")
    public String index() {
        return PAGE_CARD_LIST;
    }

    @RequestMapping("/cardlist/list")
    @ResponseBody
    public List<Card> list() {
        return cardListService.getCardList();
    }
}
