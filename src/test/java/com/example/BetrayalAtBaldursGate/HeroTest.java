package com.example.BetrayalAtBaldursGate;

import com.example.BetrayalAtBaldursGate.characters.Hero;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    private Hero hero1;
    private ArrayList inventory;

    @Before
    public void before(){
        inventory = new ArrayList();
        hero1 = new Hero("barry",5,6,7,8,"human",inventory);

    }

    @Test
    public void heroHasName(){
        assertEquals("barry", hero1.getName());
    }

    @
}
