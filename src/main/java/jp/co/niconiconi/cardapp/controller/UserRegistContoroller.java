package jp.co.niconiconi.cardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.niconiconi.cardapp.form.UserRegistForm;
import jp.co.niconiconi.cardapp.service.UserRegistService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * ユーザー登録コントローラー.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Controller
public class UserRegistContoroller {

    private static final String PAGE_USER_REGIST = "userregist/index";

    private static final String PAGE_LOGIN = "login/Login";

    @NonNull
    private final UserRegistService loginUserRegistService;

    @ModelAttribute
    private UserRegistForm setUpForm() {
        return new UserRegistForm();
    }

    @RequestMapping("/userregist")
    public String index() {
        return PAGE_USER_REGIST;
    }

    @RequestMapping(value = "/userregist/regist", method = RequestMethod.POST)
    public String regist(@Validated UserRegistForm form, BindingResult result, Model model) {
        if(!result.hasErrors()) {
            loginUserRegistService.registLoginUser(form.getUserName(), form.getPassword());
        }
        return PAGE_LOGIN;
    }
}
