package com.example.BetrayalAtBaldursGate.tiles;

public abstract class Tile {

    private Boolean northDoor;
    private Boolean eastDoor;
    private Boolean southDoor;
    private Boolean westDoor;

    public Tile(Boolean northDoor, Boolean eastDoor, Boolean southDoor, Boolean westDoor) {
        this.northDoor = northDoor;
        this.eastDoor = eastDoor;
        this.southDoor = southDoor;
        this.westDoor = westDoor;
    }

    public Boolean getNorthDoor() {
        return northDoor;
    }

    public void setNorthDoor(Boolean northDoor) {
        this.northDoor = northDoor;
    }

    public Boolean getEastDoor() {
        return eastDoor;
    }

    public void setEastDoor(Boolean eastDoor) {
        this.eastDoor = eastDoor;
    }

    public Boolean getSouthDoor() {
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
}
