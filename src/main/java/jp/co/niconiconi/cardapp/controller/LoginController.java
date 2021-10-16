package jp.co.niconiconi.cardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.niconiconi.cardapp.constants.ReturnUrls;
/**
 * ログインコントローラー.
 * ログイン画面を表示する.
 * @author pingp
 *
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model) {
        //ログイン画面へ遷移。
        return ReturnUrls.PAGE_LOGIN.getUrl();
    }
}