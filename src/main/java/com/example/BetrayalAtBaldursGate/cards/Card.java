package com.example.BetrayalAtBaldursGate.cards;

public abstract class Card {

    private String flavourText;

    public Card(String flavourText) {
        this.flavourText = flavourText;
    }

    public String getFlavourText() {
        return flavourText;
    }

    public void setFlavourText(String flavourText) {
        this.flavourText = flavourText;
    }
}
