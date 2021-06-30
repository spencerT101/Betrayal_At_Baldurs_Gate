package com.example.BetrayalAtBaldursGate.components;

import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.cards.EventCard;

import com.example.BetrayalAtBaldursGate.characters.Monster;
import com.example.BetrayalAtBaldursGate.repositories.*;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import com.example.BetrayalAtBaldursGate.tiles.Door;
import com.example.BetrayalAtBaldursGate.tiles.Icon;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    //    @Autowired
    //    CardRepository cardRepository;
    @Autowired
    MonsterRepository monsterRepository;



    @Autowired
    HeroRepository heroRepository;

    @Autowired
    EventCardRepository eventCardRepository;

    @Autowired
    ItemCardRepository itemCardRepository;

    @Autowired
    OmenCardRepository omenCardRepository;

    @Autowired
    BuildingTileRepository buildingTileRepository;

    @Autowired
    StreetTileRepository streetTileRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Hero Gretchen = new Hero("Gretchen Titchwillow", 4, 4, 4,3, "halfling", 8,8,6,8,"image");
        heroRepository.save(Gretchen);

        Monster monster = new Monster("Test", 4, 4, 4, 4, "Test", "test");
        monsterRepository.save(monster);

        BuildingTile tileWonder = new BuildingTile("Hall of Wonders", Door.FALSE, Door.FALSE, Door.YELLOW, Door.RED, Icon.EVENT);
        buildingTileRepository.save(tileWonder);

        StreetTile ambushAlley = new StreetTile("Ambush Alley", Door.YELLOW, Door.FALSE, Door.YELLOW, Door.FALSE,Icon.EVENT);
        streetTileRepository.save(ambushAlley);

        OmenCard omenCard = new OmenCard("Test");
        omenCardRepository.save(omenCard);

        EventCard eventCard = new EventCard("Death Vision");
        eventCardRepository.save(eventCard);

    }
}
