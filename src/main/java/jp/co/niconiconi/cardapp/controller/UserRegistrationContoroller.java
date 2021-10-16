package jp.co.niconiconi.cardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.niconiconi.cardapp.constants.ReturnUrls;
import jp.co.niconiconi.cardapp.form.UserRegistrationForm;
import jp.co.niconiconi.cardapp.service.UserRegistrationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * ユーザー登録コントローラー.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Controller
public class UserRegistrationContoroller {

    @NonNull
    private final UserRegistrationService loginUserRegistService;

    @ModelAttribute
    private UserRegistrationForm setUpForm() {
        return new UserRegistrationForm();
    }

    @RequestMapping("/user/registration")
    public String index() {
        return ReturnUrls.PAGE_USER_REGIST.getUrl();
    }

    @RequestMapping(value = "/user/registration/new", method = RequestMethod.POST)
    public String regist(@Validated UserRegistrationForm form, BindingResult result, Model model) {
        if(!result.hasErrors()) {
            loginUserRegistService.registerLoginUser(form.getUserName(), form.getPassword());
        }
        return ReturnUrls.REDIRECT_LOGIN.getUrl();
    }
}
