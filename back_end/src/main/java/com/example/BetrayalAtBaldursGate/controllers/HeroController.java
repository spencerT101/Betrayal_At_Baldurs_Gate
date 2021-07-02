package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    GameService gameService;


    @GetMapping(value = "/heroes")
    public ResponseEntity<List<Hero>> getAllHeroes(){
        return new ResponseEntity<>(heroRepository.findAll(), HttpStatus.OK);
    }

    @PatchMapping(value = "/move")
    public ResponseEntity<> moveHeroes(@PathVariable String direction){
        gameService.moveHero(direction);
        return new ResponseEntity<Boolean>(gameService.moveHero(direction), HttpStatus.OK);
    }

}