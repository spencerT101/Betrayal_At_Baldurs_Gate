package com.example.BetrayalAtBaldursGate.characters;

import com.example.BetrayalAtBaldursGate.games.GameState;

import java.util.ArrayList;

public class Monster extends Character{


    public Monster(String name, int might, int speed, int sanity, int knowledge, String species, String image, GameState gameState) {
        super(name, might, speed, sanity, knowledge, species, image, gameState);
    }
}
