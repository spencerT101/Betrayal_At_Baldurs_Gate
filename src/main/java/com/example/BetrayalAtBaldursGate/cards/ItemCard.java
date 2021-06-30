package com.example.BetrayalAtBaldursGate.cards;
import javax.persistence.*;


@Entity
@Table(name = "item_cards")
public class ItemCard extends Card{



    public ItemCard(String flavourText){
        super(flavourText);
    }

    public ItemCard() {
    }


}
