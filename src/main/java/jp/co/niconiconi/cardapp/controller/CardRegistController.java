package jp.co.niconiconi.cardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * カード登録コントローラー.
 * カードの登録画面の表示およびカードの登録.
 * @author pingp
 *
 */
@Controller
public class CardRegistController {

    private static final String PAGE_CARD_REGIST = "cardregist/index";

    @RequestMapping("/cardregist")
    public String index() {
        return PAGE_CARD_REGIST;
    }
}
