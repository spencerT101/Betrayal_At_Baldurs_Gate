package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroService heroService;


    @GetMapping(value = "/heroes")
    public ResponseEntity<List<Hero>> getAllHeroes(){
        return new ResponseEntity<>(heroService.getAllHeroes(), HttpStatus.OK);
    }

    @GetMapping(value = "/scroll")
    public String scrollMessage(){
        return heroService.displayMessage();
    }

    @GetMapping(value = "/move/{direction}")
    public String moveHero(@PathVariable String left, @PathVariable String right, @PathVariable String up, @PathVariable String down){
        return heroService.moveInADirection(direction);
    }
}