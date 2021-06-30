package com.example.BetrayalAtBaldursGate.tiles;

import com.example.BetrayalAtBaldursGate.characters.Hero;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "tiles")
public abstract class Tile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "north_door")
    private Door northDoor;

    @Column(name = "east_door")
    private Door eastDoor;

    @Column(name = "south_door")
    private Door southDoor;

    @Column (name = "west_door")
    private Door westDoor;

    @Column(name = "icon")
    private Icon icon;

    private ArrayList<Hero> heroes;

    public Tile(String name,Door northDoor, Door eastDoor, Door southDoor, Door westDoor, Icon icon) {
        this.name = name;
        this.northDoor = northDoor;
        this.eastDoor = eastDoor;
        this.southDoor = southDoor;
        this.westDoor = westDoor;
        this.icon = icon;
        this.heroes = new ArrayList<>();

    }

    public Tile() {
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

    public Door getNorthDoor() {
        return northDoor;
    }

    public void setNorthDoor(Door northDoor) {
        this.northDoor = northDoor;
    }

    public Door getEastDoor() {
        return eastDoor;
    }

    public void setEastDoor(Boolean eastDoor) {
        this.eastDoor = eastDoor;
    }

    public Door getSouthDoor() {
        return southDoor;
    }

    public void setSouthDoor(Boolean southDoor) {
        this.southDoor = southDoor;
    }

    public Boolean getWestDoor() {
        return westDoor;
    }

    public void setWestDoor(Boolean westDoor) {
        this.westDoor = westDoor;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }


}
