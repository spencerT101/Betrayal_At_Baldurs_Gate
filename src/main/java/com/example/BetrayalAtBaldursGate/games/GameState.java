package com.example.BetrayalAtBaldursGate.games;

import com.example.BetrayalAtBaldursGate.cards.EventCard;
import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.characters.Monster;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;

import java.util.ArrayList;


public abstract class GameState {

    private int roundCounter;
    private ArrayList<Hero> players;
    private ArrayList<Monster> monsters;
    private ArrayList<BuildingTile> buildingTiles;
    private ArrayList<StreetTile>streetTiles;
    private ArrayList<OmenCard> omenCards;
    private ArrayList<EventCard>eventCards;


    public GameState() {
        this.roundCounter = 0;
        this.players = new ArrayList<>();
        this.monsters = new ArrayList<>();
        this.buildingTiles = new ArrayList<>();
        this.streetTiles = new ArrayList<>();
        this.omenCards = new ArrayList<>();
        this.eventCards = new ArrayList<>();
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public void setRoundCounter(int roundCounter) {
        this.roundCounter = roundCounter;
    }

    public ArrayList<Hero> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Hero> players) {
        this.players = players;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public ArrayList<BuildingTile> getBuildingTiles() {
        return buildingTiles;
    }

    public void setBuildingTiles(ArrayList<BuildingTile> buildingTiles) {
        this.buildingTiles = buildingTiles;
    }

    public ArrayList<StreetTile> getStreetTiles() {
        return streetTiles;
    }

    public void setStreetTiles(ArrayList<StreetTile> streetTiles) {
        this.streetTiles = streetTiles;
    }

    public ArrayList<OmenCard> getOmenCards() {
        return omenCards;
    }

    public void setOmenCards(ArrayList<OmenCard> omenCards) {
        this.omenCards = omenCards;
    }

    public ArrayList<EventCard> getEventCards() {
        return eventCards;
    }

    public void setEventCards(ArrayList<EventCard> eventCards) {
        this.eventCards = eventCards;
    }

    public void addPlayerToList(Hero hero){
        this.players.add(hero);
    }

    public void addBuildingTileToList(BuildingTile buildingTile){
        this.buildingTiles.add(buildingTile);
    }

    public void addStreetTileToList(StreetTile streetTile) {
        this.streetTiles.add(streetTile);
    }

    public void addOmenCardToList(OmenCard omenCard) {
        this.omenCards.add(omenCard);
    }

    public void addEventCardToList(EventCard eventCard){
        this.eventCards.add(eventCard);
    }

}
