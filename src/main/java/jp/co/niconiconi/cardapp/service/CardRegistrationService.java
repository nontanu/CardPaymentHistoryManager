package jp.co.niconiconi.cardapp.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import jp.co.niconiconi.cardapp.constants.SessionNames;
import jp.co.niconiconi.cardapp.model.LoginUser;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * カード登録サービス.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Service
public class CardRegistrationService {
    @NonNull
    private final HttpSession session;

    /**
     * カードを登録する.
     * @param name
     * @param company
     * @param brand
     */
    public void registerCard(final String name, final String company, final String brand) {
        LoginUser loginUser = (LoginUser) session.getAttribute(SessionNames.LOGIN_USER.getName());
        if (loginUser != null) {
            loginUser.registCard(name, company, brand);
        }
    }
}
