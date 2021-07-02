package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.games.StandardGame;
import com.example.BetrayalAtBaldursGate.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {

    @Autowired
    BuildingTileRepository buildingCardRepository;

    @Autowired
    StreetTileRepository streetTileRepository;

    @Autowired
    OmenCardRepository omenCardRepository;

    @Autowired
    ItemCardRepository itemCardRepository;

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MonsterRepository monsterRepository;

    @Autowired
    StandardGame game;



    public String helloSpencer(String name) {
        return "Testy " + name;
    }


    public Boolean moveHero(String direction) {
        if(direction != null){

    }
}
