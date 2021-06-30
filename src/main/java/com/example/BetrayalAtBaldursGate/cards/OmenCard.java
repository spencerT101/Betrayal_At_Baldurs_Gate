package com.example.BetrayalAtBaldursGate.cards;
import javax.persistence.*;


@Entity
@Table(name = "omen_cards")
public class OmenCard extends Card{

    public OmenCard(String flavourText) {
        super(flavourText);
    }


    public void hauntRoll(){

    }
}