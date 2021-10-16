package jp.co.niconiconi.cardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.niconiconi.cardapp.constants.ReturnUrls;
import jp.co.niconiconi.cardapp.form.CardRegistrationForm;
import jp.co.niconiconi.cardapp.service.CardRegistrationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * カード登録コントローラー.
 * カードの登録画面の表示およびカードの登録.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Controller
public class CardRegistrationController {

    @NonNull
    private final CardRegistrationService cardRegistrationService;

    @RequestMapping("/card/registration")
    public String index() {
        return ReturnUrls.PAGE_CARD_REGIST.getUrl();
    }

    @ModelAttribute
    private CardRegistrationForm setUpForm() {
        return new CardRegistrationForm();
    }

    @RequestMapping(value = "/card/registration/new", method = RequestMethod.POST)
    public String regist(@Validated CardRegistrationForm form, BindingResult result, Model model) {
        if (!result.hasErrors()) {
            cardRegistrationService.registerCard(form.getName(), form.getCompany(), form.getBrand());
        }
        return ReturnUrls.REDIRECT_CARD.getUrl();
    }
}
