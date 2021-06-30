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
        Hero Gretchen = new Hero("Gretchen Titchwillow", 4, 4, 4, 3, "Halfling", 8, 8, 6, 8, "image", "Druid", 112);
        heroRepository.save(Gretchen);

        Monster monster = new Monster("Test", 4, 4, 4, 4, "Test", "test");
        monsterRepository.save(monster);

        BuildingTile tileWonder = new BuildingTile("Hall of Wonders", Door.FALSE, Door.FALSE, Door.YELLOW, Door.RED, Icon.EVENT);
        buildingTileRepository.save(tileWonder);

        StreetTile ambushAlley = new StreetTile("Ambush Alley", Door.YELLOW, Door.FALSE, Door.YELLOW, Door.FALSE, Icon.EVENT);
        streetTileRepository.save(ambushAlley);

        OmenCard omenCard = new OmenCard("Care Bear Vision", "Bartholomew", "Care bears rule!");
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
                        "This omen can't be dropped or traded, but it can be stolen.");
        omenCardRepository.save(berserkerAxe);

        OmenCard bookOfSpells = new OmenCard(
                "This dusty tome is filled with secrets - some useful, others dangerous",
                "Book of Spells",
                "If you " +
                        "attack an opponent that has a Sanity trait, you may attack with Sanity instead of Might (your " +
                        "opponent defends with Sanity, amd damage is mental instead of physical)." +
                        "If you attack an opponent in this way and you take damage, take 1 additional point of damage." +
                        "You can't use another weapon while you're using this one.");
        omenCardRepository.save(bookOfSpells);


        OmenCard cursedArmor = new OmenCard(
                "The armor makes you feel like you can stand up to anyone",
                "Cursed Armor",
                "Gain 1 Sanity." +
                        "Lose 1 Sanity if oyu lose control of the Cursed Armor." +
                        "Whenever you roll defence, you may add 1 to the result. If you do, lose 1 sanity." +
                        "This omen can't be stolen.");
        omenCardRepository.save(cursedArmor);


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
                        " stolen, any small monster tokens stay on the card.");
        omenCardRepository.save(deckOfManyThings);

        OmenCard dimensionalShackles = new OmenCard(
                "The shackles immediately latch onto your legs",
                "Dimensional Shackles",
                "Lose 1 Speed." +
                        "Gain 1 Speed if you lose control of the Dimensional Shackles." +
                        "Whenever you make an attack against an adventurer on your tile and win, you may give the " +
                        "defender this card instead of inflicting damage." +
                        "This omen can't be dropped or stolen, but it can be given (as above). It can also be traded " +
                        "as long as both players agree.");
        omenCardRepository.save(dimensionalShackles);

        OmenCard whisperingSkull = new OmenCard("A small skull carved from jade. You hear vague, distant whispers as you look into it's empty eyes",
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

        OmenCard meenLock = new OmenCard("A strange, horrid fey creature lurks in the shadows, filling your mind with terror",
                "Meenlock",
                "Gain 2 Speed." +
                        "When you take physical damage, you must apply it as mental damage instead" +
                        "Lose 2 Speed if you loase control of the Meenlock" +
                        "This omen can't be dropped, traded, or stolen" +
                        "Make a haunt roll now");
        omenCardRepository.save(meenLock);

        OmenCard ironFlaskOfTuerney = new OmenCard("This iron flask shudders and quakes, as if something wants out",
                "Iron Flask of Tuerny",
                "Instead of attacking normally, you use this omen on your turn to open the flask, unleashing the balor trapped within" +
                        "The demon makes a Might 6 attack against every adventurer, monster, and NPC on your tile, including yourself, before returning to the Abyss" +
                        "This omen can be used only once per game" +
                        "Make a haunt roll now.");
        omenCardRepository.save(ironFlaskOfTuerney);

        OmenCard homonculus = new OmenCard("Companion: A pitiable, misshapen humanoid figure formed from clay, no more than a foot tall, emerges from the shadows and stares at you with black, unblinking eyes.",
                "Homunculus",
                "Gain 1 Might and 1 Knowledge" +
                        "Lose 1 Might and 1 Knowledge if you lose control of the Homunculus" +
                        "This omen can't be dropped, traded, or stolen" +
                        "Make a haunt roll now.");
        omenCardRepository.save(homonculus);

        OmenCard figurineOfWonder = new OmenCard("Companion: The small ebony statuette, shaped like a fly, fits in the palm of your hand",
                "Figurine of Wonderous Power",
                "The figurine transforms into a giant fly that stays with you and protects you.Once per game, when you take any amount of damage, you may ignore that damage instead." +
                        "This omen can't be dropped, traded, or stolen." +
                        "Make a haunt roll now.");
        omenCardRepository.save(figurineOfWonder);

        OmenCard eyeOfVecna = new OmenCard("Power at the cost of a single eye. A bargain to some, a curse to others",
                "Eye of Vecna",
                "Gain 1 Knowledge." +
                        "Lose 1 Knowledge if you lose control of the Eye of Vecna" +
                        "The Eye of Vecna grants you the power to inspire terror in others." +
                        "If an opponent attempts to move onto the tile you occupy, you may have them attempt a roll 2+ with 2 dice." +
                        "If they succeed, they enter your tile. If they fail, they stay on their current tile and end their movement for the turn." +
                        "If they failed and rolled a 1, you also take 1 of mental damage." +
                        "Make a haunt roll now");
        omenCardRepository.save(eyeOfVecna);

    }
}

























