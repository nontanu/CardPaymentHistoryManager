package jp.co.niconiconi.cardapp.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jp.co.niconiconi.cardapp.data.entity.Card;

/**
 * カードリポジトリ.
 * @author pingp
 *
 */
public interface CardRepository extends CrudRepository<Card, String> {
    @Query("select card from Card card where user_id = :userId")
    public List<Card> findByUserId(@Param("userId") int userId);
}