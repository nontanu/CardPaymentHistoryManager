package jp.co.niconiconi.cardapp.constants;

public enum ReturnUrls {
    PAGE_LOGIN("login/Login"),
    PAGE_CARD_LIST("card/list/index"),
    PAGE_USER_REGIST("user/registration/index"),
    PAGE_CARD_REGIST("card/registration/index"),
    REDIRECT_CARD("redirect:/card"),
    REDIRECT_LOGIN("redirect:/login");

    private final String url;

    private ReturnUrls(final String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
