package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroRepository heroRepository;


    @GetMapping(value = "/heroes")
    public ResponseEntity<List<Hero>> getAllHeroes(){
        return new ResponseEntity<>(heroRepository.findAll(), HttpStatus.OK);
    }
}