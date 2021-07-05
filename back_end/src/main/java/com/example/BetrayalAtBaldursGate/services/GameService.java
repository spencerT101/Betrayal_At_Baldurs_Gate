package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.games.GameState;
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


    public Boolean moveHero(Integer direction) {
        if(direction != null){
            game.getHero().move(game, direction);
            game.getBuildingTiles().forEach(buildingTile -> {if (buildingTile == game.getHero().getTile()){
                buildingTile.addHero(game.getHero());
            }});
            game.getStreetTiles().forEach(streetTile -> {if (streetTile == game.getHero().getTile()){
                streetTile.addHero(game.getHero());
            }});
            return true;

        } else {
            return false;
        }
    }
}
