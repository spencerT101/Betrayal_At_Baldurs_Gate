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

        EventCard aFlumphAppears = new EventCard("The strangest thing you've ever seen - a jellyfish with eyes - floats out of the corner, gesturing emphatically with its barbed tentacles", "A Flumph Appears", "You must attempt a knowledge roll: 4+ You discover a hidden treasure cache. Draw an item card, 2-3: You discover a hollow filled with spiders that swarm up your arm. Lose 1 Might. 0-1 You find a Kobold catacomb title( or the Catacomb landing if the Kobold hideout isn't in play yet) Take 1 die of Physical damage.");
        eventCardRepository.save(aFlumphAppears);

        EventCard aHagsBlessing = new EventCard("A stooped figure clad in a tattered robe stumbles toward you. She studies you with milky cataract-filled eyes before pointing at you and speaking", "A Hag's Blessing", "Roll 2 dice: 4: She whispers forbidden love. Gain 1 Knowledge, 3: She offers a spell of protection gain 1 Sanity. 3: She mutters incoherently before shuffling on. 1: She promises death and ruin, lose 1 Sanity. 0: She curses you. The next time you would roll for anything except for the haunt treat the results as 0");
        eventCardRepository.save(aHagsBlessing);

        EventCard arcaneGate = new EventCard("A portal springs to life here, offering a shimmering passage to another location", "Arcane Gate", "Place 1 square Arcane Gate token on this tile, and the second square Arcane Gate token on any other tile on the board. An adventure, monster or NPC can move between those tiles with 1 space of movement");
        eventCardRepository.save(arcaneGate);

        EventCard bhallsCall = new EventCard("You have a vision of a grotesque skull, or blood pools around your feet and your ears", "Bhaal's Call", "You must attempt a Sanity roll: 4+ You find the vision oddly compelling, Gain 1 Might. 2-3: Lose 1 Sanity. 0-1: Your mind is attacked. If your mind is attacked, the player on your right rolls a Sanity 3 attacked against you. You dont roll defence. Instead, if the result is higher than your Sanity, you take Mental damage equal to the difference between the two");
        eventCardRepository.save(bhallsCall);

        EventCard craniumRats = new EventCard("A horde of rats emerge from their burrows to surround you. Their overgrown, pulsating brains extrude from their skulls. Theireyes glow red and you feel their minds link in an overwhelming force that reaches into your brains to root through your memories ", "Cranium Rats", "You must attempt a Sanity roll: 4+ You overwhelm the rats and loot their minds gain 1 Sanity. 2-3 They find what they were looking for. Lose 1 Knowledge. 0-1 you were unprepared for the assault. Take 1 die of Mental damage.  ");
        eventCardRepository.save(craniumRats);

        EventCard crawlingClaw = new EventCard("A severed hand drops from above and grabs your neck. You grasp and wheeze as it crushes your throat in an iron grip", "Crawling Claw", "You must attempt a Might roll: 4+ You tear the crawling claw from your throat. 0-3 You cant get the crawling claw off. Keep this card. Take 1 point of physical damage at the end of each of your turns. Discard this card the next time you increase any traits or if you end your turn on the Weapon Shop building tile or following catacomb tiles, Assassin's Run, Beast's Lair, Gladiators Pit, Kitchen Basement or Weapon Ship basement. ");
        eventCardRepository.save(crawlingClaw);

        EventCard deathVision = new EventCard("A huge horde of bugs gather in a pile. They flee as you approach, revealing your own half-eaten corpse", "Death Vision", "You must attempt a Sanity Roll. 4+ It was just a horrible vision. Gain 1 Sanity. 2-3 The image disturbs you. Lose 1 Sanity. 0-1 You scream as the buds swarm over you take 1 die of physical damage");
        eventCardRepository.save(deathVision);

        EventCard demonicPossession = new EventCard("You find an obsidian idol sticking out the ground. As you attempt to dislodge it, the demon trapped within tries to possess you", "Demonic Possession", "You must attempt a Sainty roll. Add 1 to the result if your adventurer is a drow. 6+ you overwhelm the demon. Gain 1 in a trait of your choice. 3-5 You battle to a draw. Nothing happens. 1-2 It takes a piece of your mind with it. Lose 1 Sanity. 0 You remember everything as the demon forces you to kill an innocent. Lose 2 Sanity");
        eventCardRepository.save(demonicPossession);

        EventCard desiccatedHeart = new EventCard("You find a shriveled ", "Demonic Possession", "You must attempt a Sainty roll. Add 1 to the result if your adventurer is a drow. 6+ you overwhelm the demon. Gain 1 in a trait of your choice. 3-5 You battle to a draw. Nothing happens. 1-2 It takes a piece of your mind with it. Lose 1 Sanity. 0 You remember everything as the demon forces you to kill an innocent. Lose 2 Sanity");
        eventCardRepository.save(desiccatedHeart);

        EventCard shamblingForm = new EventCard("A drunkard staggers toward you through the night. As the form draws near, you see to your horror that it is actually a bloated shambling zombie","Shambling Form","You must attempt a Speed roll: 4= You dodge the zombie, evading its reach just before it explodes in a burst of slime and pus. You find a useful item in the remains. Draw an item card. 2-3 You attempt to flee but are caught in the shower of gore as the zombie bursts. Lose 1 Speed. 0-1 The zombie grabs you and explodes messily. Lose 1 Might.");
        eventCardRepository.save(shamblingForm);

        EventCard soundOfLoomingDoom = new EventCard("You hear a low growl. Glowing red eyes pierce the darkness ahead. Out from the shadows glides a large yeth hound, but its face looks less like a dog's and more like yours.","Sound of Looming Doom","Each adventurer must attempt a Speed rool. If there is a tie for the highest or lowest, the tied adventurers roll again until there is no tie. The highest roller gains 1 Speed. The lowest roller is attacked by the yeth hound. The player to their right rolls a Speed 3 attack for the yeth hound. They defend with Speed.");
        eventCardRepository.save(soundOfLoomingDoom);

        EventCard stalkingShadow = new EventCard("Your shadow seems to flicker and dance, moving of its own accord as it coalesces into a horrid humanoid shape that lunges at you.", "Stalking Shadow", "You must attempt a Speed roll: 4+ You dodge the shadow and escape its clutches. 2-3 The shadow grabs you, and deadening cold flows through your lower body. Lose 1 Speed.");
        eventCardRepository.save(stalkingShadow);

        EventCard testOfTheDeadThree = new EventCard("Three spectral images appear before you: a sinister warrior clad in armour; a shriveled, skeletal mage in robes; and a sneering man who carries a bloody dagger. You sense they are here to test you.","Test of the Dead Three","You must attempt a sparate roll for each of Might, Speed, and Knowledge: 2+ That trait is unaffected. 0-1 Lose 1 from that trait. If you roll 2 or higher for all 3 rolls, gain 1 in one of those traits of your choice");
        eventCardRepository.save(testOfTheDeadThree);

        EventCard theGreenDevilFace = new EventCard("The green stone face of devilish countenance protrudes from the wall. Its mouth is agape and filled with utter darkness. The darkness beckons you.","The Green Devil Face","You reach into the darkness. Roll 4 dice: 5+ You find something inside! Draw an item card. 3-4 Nothing happens. 1-2 You are teleported away. Discard all item cards you control and place your adventurer on the Elfsong Tavern tile. Lose 1 Sanity as your clothes didn't come with you. 0 If the haunt hasn't begun, treat this roll as a 1. Otherwise, the sphere of annihilation within the darkness kills you. You die.");
        eventCardRepository.save(theGreenDevilFace);

        EventCard theStorm = new EventCard("It starts with a single flash, then another. Soon the night is lit by a thousand streaks of lightning.","The Storm" ,"Every adventurer on a street tile must immediately use their Speed to move onto the closest building tile if possible. Each of those advenuters then rolls dice equal to the total spaces they moved (maximum of 8 dice). If they couldn't move onto a building tile they roll 8 dice. 6+ Take 2 dice of physical damage. 4-5 Take 1 die of physical damage. 2-3 Take 1 point of physical damage. 0-1 You got lucky. This time.");
        eventCardRepository.save(theStorm);

        EventCard trapper = new EventCard("The wall here looks strange, as if covered with slime. When you step closer to investigate, it curls around you in a crushing grip.","Trapper","You must attempt a Might roll: 4+ You break free and slay the trapper with one mighty blow. Draw an item card. 1-3 You pull free from the trapper's grip and escape. Take 1 die of physical damage. 0 You are trapped! Take 1 die of physical damage and your turn ends. Keep this card in front of you. Repeat this Might roll at the start of your next turn, adding 1 die to the roll for each adventurer on your tile. Discard this card unless you roll 0 again.");
        eventCardRepository.save(trapper);

        EventCard troglodyteStench = new EventCard("This area is filled with a sickening stench. Your head swims and your limbs suddenly feel as if they are carved from lead.","Troglodyte Stench","Place the square Stench token on this tile and this card near it. Adventurers who make Might rolls on this tile roll 2 fewer dice(minimum of 1 die).");
        eventCardRepository.save(troglodyteStench);

        EventCard vampiricMist = new EventCard("Fog drifts towards you. A rat runs into it and you hear a loud squeak. As the fog wafts forward, you see the husk of the rodent.","Vampiric Mist","You must attempt a Knowledge roll: 4+ It's vampiric mist, get away! Gain 1 Speed. 0-3 It must only kill rats, you say to yourself as you walk through the fog. Take 1 point of physical damage.");
        eventCardRepository.save(vampiricMist);

        EventCard wereratBite = new EventCard("You look down and see a fat, horrid-looking rat scamper away as you notice the pain in your foot. You suddenly don't feel so well.", "Wererat Bite", "You have been infected with lycanthropy. Keep this card in front of you. Lose 1 Knowledge and 1 Sanity. Gain 1 Might and Speed. If you inflict physical damage to an adventurer on your tile with an attack, you may choose to also infect them with lycanthropy. If you do, they lose 1 Knowledge and 1 Sanity, and gain 1 Might and 1 Speed. They can then infect other adventurers using the same rules. Each adventurer can be infected with lycanthropy only once per game.");
        eventCardRepository.save(wereratBite);

        EventCard willOWisp = new EventCard("A flickering light appears in the gloom ahead. It bobs and weaves in the air, and you feel an overwhelming compulsion to follow it.", "Will-O'-Wisp", "You must attempt a Knowledge roll: 4+ You resist the urge to follow the light. Gain 1 Knowledge. 2-3 Remove your adventurer figure from the board. At the start of your next turn, place your figure on any revealed omen tile, or the Elfsong Tavern tile if there are no omen tiles. Take 1 die of physical damage. 0-1 You follow the will-o'wisp in circles. Place your adventurer figure on the Elfsong Tavern tile.");
        eventCardRepository.save(willOWisp);

        EventCard yellowMold = new EventCard("Clumps of sickly yellow mold grow here. Spores erupt from the mold, and a coughing fit overcomes you.", "Yellow Mold", "Place the square Yellow Mold token on this tile and this card near it. Any time an adventurer enters the tile, including when you draw this card, that adventurer must attempt a Might roll: 4+ Puny spores can't hurt you. 1-3 This cough is going to last a while. Lose 1 Might. 0 You double over in pain. Take 1 die of physical damage.");
        eventCardRepository.save(yellowMold);

        EventCard zhentarimOpportunist = new EventCard("A thug leaps from the shadows, brandishing a dagger. 'Give me what I want, and no one gets hurt,' he hisses at you.", "Zhentarim Opportunist", "You may discard an item card along with this card. If you don't, the thug attacks. The player to your right rolls a Might 4 attack for the thug. You defend with Might as normal. If you take any damage from the attack, the thug is emboldened by his succcess. Draw the top 3 cards from the event deck without looking at them. Add this card ot them, shuffle them and place them back on top of the event deck.");
        eventCardRepository.save(zhentarimOpportunist);


    }
}
