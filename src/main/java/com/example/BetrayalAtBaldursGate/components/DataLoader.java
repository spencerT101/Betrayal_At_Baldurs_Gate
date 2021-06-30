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

        EventCard aFlumphAppears = new EventCard("The strangest thing you've ever seen - a jellyfish with eyes - floats out of the corner, gesturing emphatically with its barbed tentacles", "A Flumph Appears", "You must attempt a knowledge roll: 4+ You discover a hidden treasure cache. Draw an item card, 2-3: You discover a hollow filled with spiders that swarm up your arm. Lose 1 might. 0-1 You find a Kobold catacomb title( or the Catacomb landing if the Kobold hideout isn't in play yet) Take 1 die of physical damage.");
        eventCardRepository.save(aFlumphAppears);

        EventCard aHagsBlessing = new EventCard("A stooped figure clad in a tattered robe stumbles toward you. She studies you with milky cataract-filled eyes before pointing at you and speaking", "A Hag's Blessing", "Roll 2 dice: 4: She whispers forbidden love. Gain 1 knowledge, 3: She offers a spell of protection gain 1 Sanity. 3: She mutters incoherently before shuffling on. 1: She promises death and ruin, lose 1 sanity. 0: She curses you. The next time you would roll for anything except for the haunt treat the results as 0");
        eventCardRepository.save(aHagsBlessing);

        EventCard aHagsBlessing = new EventCard("A stooped figure clad in a tattered robe stumbles toward you. She studies you with milky cataract-filled eyes before pointing at you and speaking", "A Hag's Blessing", "Roll 2 dice: 4: She whispers forbidden love. Gain 1 knowledge, 3: She offers a spell of protection gain 1 Sanity. 3: She mutters incoherently before shuffling on. 1: She promises death and ruin, lose 1 sanity. 0: She curses you. The next time you would roll for anything except for the haunt treat the results as 0");
        eventCardRepository.save(aHagsBlessing);


        EventCard willOWisp = new EventCard("A flickering light appears in the gloom ahead. It bobs and weaves in the air, and you feel an overwhelming compulsion to follow it.", "Will-O'-Wisp", "You ");
        eventCardRepository.save(willOWisp);

        EventCard yellowMold = new EventCard("Clumps of sickly yellow mold grow here. Spores erupt from the mold, and a coughing fit overcomes you.", "Yellow Mold", "Place the square Yellow Mold token on this tile and this card near it. Any time an adventurer enters the tile, including when you draw this card, that adventurer must attempt a Might roll: 4+ Puny spores can't hurt you. 1-3 This cough is going to last a while. Lose 1 Might. 0 You double over in pain. Take 1 die of physical damage.");
        eventCardRepository.save(yellowMold);

        EventCard zhentarimOpportunist = new EventCard("A thug leaps from the shadows, brandishing a dagger. 'Give me what I want, and no one gets hurt,' he hisses at you.", "Zhentarim Opportunist", "You may discard an item card along with this card. If you don't, the thug attacks. The player to your right rolls a Might 4 attack for the thug. You defend with Might as normal. If you take any damage from the attack, the thug is emboldened by his succcess. Draw the top 3 cards from the event deck without looking at them. Add this card ot them, shuffle them and place them back on top of the event deck.");
        eventCardRepository.save(zhentarimOpportunist);


    }
}
