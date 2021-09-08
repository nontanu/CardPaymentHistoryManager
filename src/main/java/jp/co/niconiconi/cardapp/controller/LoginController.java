package jp.co.niconiconi.cardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private static final String PAGE_LOGIN = "login/Login";

    @RequestMapping("/login")
    public String login(Model model) {
        //ログイン画面へ遷移。
        return PAGE_LOGIN;
    }
}