package com.example.BetrayalAtBaldursGate;

import com.example.BetrayalAtBaldursGate.tiles.Door;
import com.example.BetrayalAtBaldursGate.tiles.Icon;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StreetTileTest {

    StreetTile streetTile1;


    @Before
    public void setup(){
        streetTile1 = new StreetTile("Tile", Door.FALSE, Door.RED, Door.YELLOW, Door.RED, Icon.EVENT);
    }

    @Test
    public void canGetStreetTileName() {
        assertEquals("Tile", streetTile1.getName());

    }

}
