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
        Hero Gretchen = new Hero("Gretchen Titchwillow", 4, 4, 4,3, "Halfling", 8,8,6,8,"image", "Druid", 112);
        heroRepository.save(Gretchen);


        BuildingTile tileWonder = new BuildingTile("Hall of Wonders", Door.FALSE, Door.FALSE, Door.YELLOW, Door.RED, Icon.EVENT);
        buildingTileRepository.save(tileWonder);

        StreetTile ambushAlley = new StreetTile("Ambush Alley", Door.YELLOW, Door.FALSE, Door.YELLOW, Door.FALSE,Icon.EVENT);
        streetTileRepository.save(ambushAlley);

        OmenCard whisperingSkull = new OmenCard ("A small skull carved from jade. You hear vague, distant whispers as you look into it's empty eyes",
                "Whispering Skull",
                "Once during your turn after the haunt has begun, you mat move 1 small monster or NPC 1 space." +
                        "Make a haunt roll now.");
        omenCardRepository.save(whisperingSkull);

        OmenCard symbolOfBhaal = new OmenCard("This sinister holy symbol is covered in blood. You feel your temperature begin to rise as you handle it",
                "Symbol of Bhaal",
                "After the haunt begins, whenever an adventurer is killed, roll a die. " +
                "2 the symbol pulses with power.Gain 1 Might. " +
                "1 You feel...nothing. " +
                "0 If you killed that adventurer, nothing happens." +
                "Otherwise, take 1 die of mental damage." +
                        "Make a haunt roll now");
        omenCardRepository.save(symbolOfBhaal);

        OmenCard pipesOfHaunting = new OmenCard("The spellbinding tune created by this instrument causes those around to relive their worst fears",
                "Pipes of Haunting",
                "You may use this omen to play the pipes during your turn after the haunt" +
                        "If you do, each adventurer, small monster, and NPC within 2 tiles of you must attempt a Sanity 4+ roll" +
                        "If they do not have a Sanity trait, or they fail the roll, you may move them 1 space away from you if possible (they cannot discover a new tile with that movement)" +
                        "Make a haunt roll now.");
        omenCardRepository.save(pipesOfHaunting);

        OmenCard meenLock= new OmenCard("A strange, horrid fey creature lurks in the shadows, filling your mind with terror",
                "Meenlock","Gain 2 Speed." +
                "When you take physical damage, you must apply it as mental damage instead" +
                "Lose 2 Speed if you loase control of the Meenlock" +
                "This omen can't be dropped, traded, or stolen" +
                "Make a haunt roll now");
        omenCardRepository.save(meenLock);






    }
}
