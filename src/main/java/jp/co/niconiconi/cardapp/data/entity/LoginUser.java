package jp.co.niconiconi.cardapp.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class LoginUser {
	@Id
	private Integer id;
	private String userId;
	private String password;
	private String name;
}
