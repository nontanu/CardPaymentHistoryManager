package jp.co.niconiconi.cardapp.service;

import org.springframework.stereotype.Service;

import jp.co.niconiconi.cardapp.Interactor.UserInteractor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * ユーザー登録サービス.
 * @author pingp
 *
 */
@RequiredArgsConstructor
@Service
public class UserRegistrationService {
    @NonNull
    private final UserInteractor loginUserInteractor;

    public void registerLoginUser(String id, String password) {
        loginUserInteractor.registerLoginUser(id, password);
    }
}
