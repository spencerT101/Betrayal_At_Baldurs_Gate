package com.example.BetrayalAtBaldursGate.games;

import java.util.ArrayList;

public class Game {

    private int omenCounter;
    private int roundCounter;
    private ArrayList players;
    private ArrayList buildingTiles;
    private ArrayList streetTiles;
    private ArrayList omenCards;
    private ArrayList eventCards;


    public Game(int omenCounter, int roundCounter, ArrayList players, ArrayList buildingTiles, ArrayList streetTiles, ArrayList omenCards, ArrayList eventCards) {
        this.omenCounter = omenCounter;
        this.roundCounter = roundCounter;
        this.players = players;
        this.buildingTiles = buildingTiles;
        this.streetTiles = streetTiles;
        this.omenCards = omenCards;
        this.eventCards = eventCards;
    }

    public int getOmenCounter() {
        return omenCounter;
    }

    public void setOmenCounter(int omenCounter) {
        this.omenCounter = omenCounter;
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public void setRoundCounter(int roundCounter) {
        this.roundCounter = roundCounter;
    }

    public ArrayList getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList players) {
        this.players = players;
    }

    public ArrayList getBuildingTiles() {
        return buildingTiles;
    }

    public void setBuildingTiles(ArrayList buildingTiles) {
        this.buildingTiles = buildingTiles;
    }

    public ArrayList getStreetTiles() {
        return streetTiles;
    }

    public void setStreetTiles(ArrayList streetTiles) {
        this.streetTiles = streetTiles;
    }

    public ArrayList getOmenCards() {
        return omenCards;
    }

    public void setOmenCards(ArrayList omenCards) {
        this.omenCards = omenCards;
    }

    public ArrayList getEventCards() {
        return eventCards;
    }

    public void setEventCards(ArrayList eventCards) {
        this.eventCards = eventCards;
    }
}
