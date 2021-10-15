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
public class UserRegistService {
    @NonNull
    private final UserInteractor loginUserInteractor;

    public void registLoginUser(String id, String password) {
        loginUserInteractor.save(id, password);
    }
}
