package jp.co.niconiconi.cardapp.Interactor;

import org.springframework.stereotype.Component;

@Component
public interface UserInteractor {
    public void save(String userId, String password);
}
