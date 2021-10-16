package jp.co.niconiconi.cardapp.constants;
/**
 * セッションに格納するセッション名.
 * @author pingp
 *
 */
public enum SessionNames {

    LOGIN_USER("loginUser");

    private final String name;

    private SessionNames(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
