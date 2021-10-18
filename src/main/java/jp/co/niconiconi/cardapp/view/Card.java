package jp.co.niconiconi.cardapp.view;

import lombok.Getter;

@Getter
public class Card {
    private final String id;
    private final String name;

    public Card(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
