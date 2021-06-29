package com.example.BetrayalAtBaldursGate.cards;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public abstract class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flavour_text")
    private String flavourText;


    public Card(String flavourText) {
        this.flavourText = flavourText;
        this.gameState = gameState;
    }

    public Card() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlavourText() {
        return flavourText;
    }

    public void setFlavourText(String flavourText) {
        this.flavourText = flavourText;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
