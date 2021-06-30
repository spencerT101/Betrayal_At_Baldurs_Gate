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

        Monster monster = new Monster("Test", 4, 4, 4, 4, "Test", "test");
        monsterRepository.save(monster);

        BuildingTile tileWonder = new BuildingTile("Hall of Wonders", Door.FALSE, Door.FALSE, Door.YELLOW, Door.RED, Icon.EVENT);
        buildingTileRepository.save(tileWonder);

        StreetTile ambushAlley = new StreetTile("Ambush Alley", Door.YELLOW, Door.FALSE, Door.YELLOW, Door.FALSE,Icon.EVENT);
        streetTileRepository.save(ambushAlley);

        OmenCard omenCard = new OmenCard("Care Bear Vision","Bartholomew","Care bears rule!");
        omenCardRepository.save(omenCard);

        EventCard eventCard = new EventCard("Death Vision", "Barry", "text example");
        eventCardRepository.save(eventCard);




        OmenCard berserkerAxe = new OmenCard(
                "This axe was made to kill. It just needs you to help it fullfill its destiny",
                "Berserker Axe",
                "Your roll 2 additional dice (maximum of 8 dice) when making a Might attack with this weapon."
                        + "If you are on a tile with one or more opponents, you cannot leave that tile unless you " +
                        "first attack an opponent with this weapon." +
                        "You can't use another weapon while you're using this one." +
                        "This omen can't be dropped or traded, but it can be stolen."
                );

        OmenCard bookOfSpells = new OmenCard(
                "This dusty tome is filled with secrets - some useful, others dangerous",
                "Book of Spells",
                "If you " +
                "attack an opponent that has a Sanity trait, you may attack with Sanity instead of Might (your " +
                "opponent defends with Sanity, amd damage is mental instead of physical)." +
                "If you attack an opponent in this way and you take damage, take 1 additional point of damage." +
                "You can't use another weapon while you're using this one."
        );

        OmenCard cursedArmor = new OmenCard(
                "The armor makes you feel like you can stand up to anyone",
                "Cursed Armor",
                "Gain 1 Sanity." +
                "Lose 1 Sanity if oyu lose control of the Cursed Armor." +
                "Whenever you roll defence, you may add 1 to the result. If you do, lose 1 sanity." +
                "This omen can't be stolen."
        );

        OmenCard deckOfManyThings = new OmenCard(
                "What's the worst that could come of drawing a card?",
                "Deck of Many Things",
                "You may use this omen " +
                "once during each of your to draw from the Deck of Many Things. Roll 4 dice and subtract 1 from the " +
                "result for each small monster token on this card:" +
                "8+ Moon:Gain 4 in a trait of your choice." +
                "5-7 Star: Gain 1 in a trait of your choice." +
                "3-4 Sun: Draw an item card." +
                "1-2 Talons: Discard an item card or take 1 point of mental damage." +
                "0 Void: Reduce one trait to its lowest value above the skull icon. If the haunt has begun, you die " +
                "instead. " +
                        "After rolling, place 1 small monster token on this card. If this card is dropped, traded, " +
                        "or" +
                        " stolen, any small monster tokens stay on the card."
        );

        OmenCard dimentionalShackles = new OmenCard(
                "The shackles immediately latch onto your legs",
                "Dimensional Shackles",
                "Lose 1 Speed." +
                        "Gain 1 Speed if you lose control of the Dimensional Shackles." +
                        "Whenever you make an attack against an adventurer on your tile and win, you may give the " +
                        "defender this card instead of inflicting damage." +
                        "This omen can't be dropped or stolen, but it can be given (as above). It can also be traded " +
                        "as long as both players agree.");

    }
}

























