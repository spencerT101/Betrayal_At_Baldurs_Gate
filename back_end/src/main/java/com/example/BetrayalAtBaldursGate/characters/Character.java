package com.example.BetrayalAtBaldursGate.characters;
import com.example.BetrayalAtBaldursGate.games.GameState;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import com.example.BetrayalAtBaldursGate.tiles.Tile;

import javax.persistence.*;


@MappedSuperclass
//Test
public abstract class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "might")
    private int might;

    @Column(name = "speed")
    private int speed;

    @Column(name = "sanity")
    private int sanity;

    @Column(name = "knowledge")
    private int knowledge;

    @Column(name = "race")
    private String race;

    @Column(name = "image")
    private String image;

    private Tile tile;


    public Character(String name, int might, int speed, int sanity, int knowledge, String race, String image) {
        this.name = name;
        this.might = might;
        this.speed = speed;
        this.sanity = sanity;
        this.knowledge = knowledge;
        this.race = race;
        this.image = image;
        this.tile = null;
    }

    public Character() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMight() {
        return might;
    }

    public void setMight(int might) {
        this.might = might;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public Tile move(GameState game, Integer direction) {
        String intendedTile = null;
        if (direction == 1){
            intendedTile = this.tile.getWestDoor().name();
        } else if(direction == 2){
            intendedTile = this.tile.getEastDoor().name();
        } else if (direction == 3){
            intendedTile = this.tile.getNorthDoor().name();
        } else if (direction == 4){
            intendedTile = this.tile.getSouthDoor().name();
        };

        String finalIntendedTile = intendedTile;
        game.getBuildingTiles().forEach(buildingTile -> {
            if (buildingTile.getName().equals(finalIntendedTile)){
                this.setTile(buildingTile);
            }
        });
        game.getStreetTiles().forEach(streetTile -> {
            if (streetTile.getName().equals(finalIntendedTile)){
                this.setTile(streetTile);
            }
        });
        return this.getTile();
    }
}

