package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.characters.Monster;
import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import com.example.BetrayalAtBaldursGate.repositories.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttackService {

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MonsterRepository monsterRepository;



//
//    public String attack(Hero hero, Monster monster) {
//        if(hero.might ==0 ||  monster.might == 0){
//            return "";
//        }
//
//    }
}
