package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.cards.OmenCard;

import com.example.BetrayalAtBaldursGate.repositories.OmenCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CardService {

    @Autowired
    OmenCardRepository omenCardRepository;



    public List<OmenCard> getAllOmenCards() {
        List <OmenCard>allOmenCardsList = omenCardRepository.findAll();
        Collections.shuffle(allOmenCardsList, new Random());
        return allOmenCardsList;

    }




}
