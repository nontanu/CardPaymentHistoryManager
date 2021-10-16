package jp.co.niconiconi.cardapp.Interactor;

import org.springframework.stereotype.Component;

@Component
public interface UserInteractor {
    /**
     * ユーザーを登録する.
     * @param userId
     * @param password
     */
    public void registerLoginUser(String userId, String password);
}
