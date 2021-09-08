package jp.co.niconiconi.cardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardListContoroller {

	private static final String PAGE_CARD_LIST = "cardlist/index";

	@RequestMapping("/cardlist")
	public String index() {
		return PAGE_CARD_LIST;
	}
}
