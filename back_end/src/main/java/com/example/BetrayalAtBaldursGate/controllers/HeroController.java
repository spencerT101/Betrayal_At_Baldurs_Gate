package com.example.BetrayalAtBaldursGate.controllers;

import com.example.BetrayalAtBaldursGate.games.StandardGame;
import com.example.BetrayalAtBaldursGate.repositories.*;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.services.GameService;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
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
    MonsterRepository monsterRepository;

    @Autowired
    BuildingTileRepository buildingTileRepository;

    @Autowired
    StreetTileRepository streetTileRepository;

    @Autowired
    OmenCardRepository omenCardRepository;

    @Autowired
    EventCardRepository eventCardRepository;

    @Autowired
    GameService gameService;


    @GetMapping(value = "/heroes")
    public ResponseEntity<List<Hero>> getAllHeroes(){
        return new ResponseEntity<>(heroRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/move/{direction}")
    public ResponseEntity<String> moveHeroes(@PathVariable Integer direction){

        return new ResponseEntity<>(gameService.moveHero(direction, game), HttpStatus.OK);
    }

    @GetMapping(value = "/start")
    public ResponseEntity<String> startGame(){
        StandardGame game = new StandardGame();
        Hero hero = heroRepository.findAll().get(0);
        monsterRepository.findAll().forEach(monster -> game.getMonsters().add(monster));
        buildingTileRepository.findAll().forEach(buildingTile -> game.getBuildingTiles().add(buildingTile));
        streetTileRepository.findAll().forEach(streetTile -> game.getStreetTiles().add(streetTile));
        omenCardRepository.findAll().forEach(omenCard -> game.getOmenCards().add(omenCard));
        eventCardRepository.findAll().forEach(eventCard -> game.getEventCards().add(eventCard));
        game.getBuildingTiles().forEach(buildingTile -> {
            if (buildingTile.getName() == "Elfsong Tavern") {
                buildingTile.addHero(hero);
            }
        });
        return new ResponseEntity("Random string7", HttpStatus.OK);
    }


}