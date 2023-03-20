package jp.co.niconiconi.cardapp.factory;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import jp.co.niconiconi.cardapp.constants.SessionNames;
import jp.co.niconiconi.cardapp.data.repository.CardRepository;
import jp.co.niconiconi.cardapp.data.repository.LoginUserRepository;
import jp.co.niconiconi.cardapp.domain.model.Card;
import jp.co.niconiconi.cardapp.domain.model.LoginUser;
import jp.co.niconiconi.cardapp.domain.model.User;
import jp.co.niconiconi.cardapp.util.Lists;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
/**
 * ログインユーザー用のファクトリ.
 * @author pingp
 *
 */
public class LoginUserFactory extends UserFactory {

    @NonNull
    private final LoginUserRepository loginUserRepository;

    @NonNull
    private final CardRepository cardRepository;

    @NonNull
    private final HttpSession session;

    /**
     * ログインユーザーを作成する.
     */
    public User create(String userId) {
        User loginUser = newLoginUser(userId);
        // セッションに格納しておく
        session.setAttribute(SessionNames.LOGIN_USER.getName(), loginUser);
        return newLoginUser(userId);
    }

    /**
     * ログインユーザーを組み立てる.
     * @param userId
     * @return
     */
    private User newLoginUser(String userId) {
        jp.co.niconiconi.cardapp.data.entity.LoginUser loginUserEntity = getLoginUserEntity(userId);
        LoginUser loginUser = new LoginUser(
                loginUserEntity.getId(),
                loginUserEntity.getUserId(),
                loginUserEntity.getName(),
                loginUserEntity.getPassword(),
                getCardListById(loginUserEntity.getId()));
        return loginUser;
    }

    /**
     * DBからログインユーザーを取得する.
     * @param userId
     * @return
     */
    private jp.co.niconiconi.cardapp.data.entity.LoginUser getLoginUserEntity(String userId) {
        // 渡されたIDをキーにユーザ情報取得
        jp.co.niconiconi.cardapp.data.entity.LoginUser loginUserEntity = loginUserRepository.findByUserId(userId)
                .orElseThrow(() -> new UsernameNotFoundException("ユーザーが登録されていません。"));
        return loginUserEntity;
    }

    /**
     * カード一覧を取得する.
     * @param id
     * @return
     */
    private List<Card> getCardListById(int id) {
        List<jp.co.niconiconi.cardapp.data.entity.Card> cardEntityList = getCardEntityList(id);
        // エンティティをモデルに変換する
        List<Card> cardList = Lists.convertInternalObject(cardEntityList,
                s -> new Card(s.getId(), s.getUserId(), s.getName(), s.getCompany(), s.getBrand()));
        return cardList;
    }

    /**
     * DBからカード一覧を取得する.
     * @param id
     * @return
     */
    private List<jp.co.niconiconi.cardapp.data.entity.Card> getCardEntityList(int id) {
        return cardRepository.findByUserId(id);
    }

}
