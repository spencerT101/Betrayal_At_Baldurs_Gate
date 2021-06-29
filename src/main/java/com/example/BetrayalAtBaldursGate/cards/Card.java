package com.example.BetrayalAtBaldursGate.cards;

import com.example.BetrayalAtBaldursGate.games.GameState;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public abstract class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flavour_text")
    private String flavourText;

    @JsonIgnoreProperties(value="cards")
    @ManyToOne
    @JoinColumn(name = "game_state_id", nullable = false)
    private GameState gameState;


    public Card(String flavourText, GameState gameState) {
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
