package com.example.BetrayalAtBaldursGate.cards;
import javax.persistence.*;

@Entity
@Table(name = "event_cards")
public class EventCard extends Card{

    public EventCard(String flavourText) {
        super(flavourText);
    }

    public EventCard() {
    }
}
