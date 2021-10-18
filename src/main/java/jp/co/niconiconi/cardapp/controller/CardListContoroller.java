package jp.co.niconiconi.cardapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.niconiconi.cardapp.constants.ReturnUrls;
import jp.co.niconiconi.cardapp.service.CardListService;
import jp.co.niconiconi.cardapp.util.Lists;
import jp.co.niconiconi.cardapp.view.Card;
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

    @NonNull
    private final CardListService cardListService;

    @RequestMapping("/card")
    public String index() {
        return ReturnUrls.PAGE_CARD_LIST.getUrl();
    }

    @RequestMapping("/card/list")
    @ResponseBody
    public List<Card> list() {
        List<jp.co.niconiconi.cardapp.model.Card> cardModelList = cardListService.getCardList();
        return cardModelListToCardViewList(cardModelList);
    }

    /**
     * modelをviewに変換する.
     * @param cardModelList
     * @return cardViewList
     */
    private List<Card> cardModelListToCardViewList(List<jp.co.niconiconi.cardapp.model.Card> cardModelList) {
        List<Card> cardViewList = Lists.convertInternalObject(cardModelList, this::newCardView);
        return cardViewList;
    }

    private Card newCardView(jp.co.niconiconi.cardapp.model.Card cardModel) {
        return new Card(cardModel.getId(), cardModel.getName());
    }
}
