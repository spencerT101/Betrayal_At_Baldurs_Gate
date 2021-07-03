package com.example.BetrayalAtBaldursGate.services;

import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    @Autowired
    HeroRepository heroRepository;

    public List<Hero> getAllHeroes(){
        return heroRepository.findAll();
    }

  public String displayMessage(){
        return "these are game instructions";
  }

  public String moveInADirection(String direction){
        if(direction == "left"){
            return "you have moved left";
        }else if( direction == "right"){
            return "you have moved right";
        } else if(direction == "up"){
            return "you have moved up";
        } else if(direction == "down")
        {
            return "you have moved down";
        }
            return "wrong move banana!";
      }
  }



