package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.cards.Card;
import com.example.BetrayalAtBaldursGate.cards.EventCard;
import com.example.BetrayalAtBaldursGate.cards.OmenCard;

import com.example.BetrayalAtBaldursGate.repositories.EventCardRepository;
import com.example.BetrayalAtBaldursGate.repositories.OmenCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CardService {

    @Autowired
    OmenCardRepository omenCardRepository;

    @Autowired
    EventCardRepository eventCardRepository;



    public List<OmenCard> getAllOmenCards() {
        List <OmenCard>allOmenCardsList = omenCardRepository.findAll();
        Collections.shuffle(allOmenCardsList, new Random());
        return allOmenCardsList;
    }

    public List<EventCard> getAllEventCards() {
        List <EventCard>allEventsCardsList = eventCardRepository.findAll();
        Collections.shuffle(allEventsCardsList, new Random());
        return allEventsCardsList;
    }

    

    public List<Card> generateACard(){
        List omenCard = getAllOmenCards();
        List eventCard = getAllEventCards();
        double number = Math.random();
        if(number <= 0.5) {
            return omenCard;
        }
        if(number > 0.5) {
            return eventCard;
        }
        return null;
    }




}
