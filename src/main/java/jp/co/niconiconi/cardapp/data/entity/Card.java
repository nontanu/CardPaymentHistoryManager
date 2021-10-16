package jp.co.niconiconi.cardapp.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Card {
    @Id
    private String id;
    private int userId;
    private String name;
    private String company;
    private String brand;
}
