package com.example.BetrayalAtBaldursGate;

import com.example.BetrayalAtBaldursGate.cards.EventCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventCardTest {

    private EventCard eventCard1;

    @Before
    public void before(){

        eventCard1 = new EventCard("Some dungeons and dragon'sy text");

    }

    @Test
    public void cardHasFlavourText(){
        assertEquals("Some dungeons and dragon'sy text", eventCard1.getFlavourText());
    }

}
