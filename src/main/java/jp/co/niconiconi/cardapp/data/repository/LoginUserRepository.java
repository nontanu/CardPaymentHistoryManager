package jp.co.niconiconi.cardapp.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jp.co.niconiconi.cardapp.data.entity.LoginUser;

public interface LoginUserRepository extends CrudRepository<LoginUser, Integer> {
	@Query("select user from LoginUser user where user_id = :userId")
	public Optional<LoginUser> findByUserId(@Param("userId")  String userId);
}
