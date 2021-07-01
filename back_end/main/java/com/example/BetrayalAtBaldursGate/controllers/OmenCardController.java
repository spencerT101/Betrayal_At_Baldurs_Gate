package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.repositories.OmenCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OmenCardController {

    @Autowired
    OmenCardRepository omenCardRepository;


    @GetMapping(value = "/omen_cards")
    public ResponseEntity<List<OmenCard>> getAllOmenCards(){
        return new ResponseEntity<>(omenCardRepository.findAll(), HttpStatus.OK);
    }
}
