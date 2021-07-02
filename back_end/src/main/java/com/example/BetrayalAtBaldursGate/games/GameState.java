package com.example.BetrayalAtBaldursGate.games;

import com.example.BetrayalAtBaldursGate.cards.EventCard;
import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.characters.Monster;
import com.example.BetrayalAtBaldursGate.repositories.*;
import com.example.BetrayalAtBaldursGate.tiles.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;





public abstract class GameState {

    HeroRepository heroRepository = new HeroRepository;
    BuildingTileRepository buildingTileRepository = new BuildingTileRepository;
    EventCardRepository eventCardRepository = new EventCardRepository;
    ItemCardRepository itemCardRepository = new ItemCardRepository;
    MonsterRepository monsterRepository = new MonsterRepository;
    OmenCardRepository omenCardRepository = new OmenCardRepository;
    StreetTileRepository streetTileRepository = new StreetTileRepository;
    BuildingTile elfsongTavern = new BuildingTile("Elfsong Tavern", Door.YELLOW, Door.YELLOW, Door.YELLOW, Door.RED, Icon.FALSE);
    BuildingTile innerChamber = new BuildingTile("Inner Chamber", Door.RED, Door.RED, Door.RED, Door.RED, Icon.FALSE);
    BuildingTile kitchen = new BuildingTile("Kitchen", Door.RED, Door.RED, Door.RED, Door.YELLOW, Icon.FALSE);


    private int roundCounter;
    private ArrayList<Hero> players;
    private ArrayList<Monster> monsters;
    private ArrayList<BuildingTile> buildingTiles;
    private ArrayList<StreetTile>streetTiles;
    private ArrayList<OmenCard> omenCards;
    private ArrayList<EventCard>eventCards;
    private ArrayList<Tile> board;


    public GameState() {
        this.roundCounter = 0;
        this.players = new ArrayList<>();
        this.monsters = new ArrayList<>();
        this.buildingTiles = new ArrayList<>();
        this.streetTiles = new ArrayList<>();
        this.omenCards = new ArrayList<>();
        this.eventCards = new ArrayList<>();
        this.board = new ArrayList<>();
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

    public ArrayList<Tile> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Tile> board) {
        this.board = board;
    }

    public void populateGame(){

        heroRepository.findAllHeroes().forEach(player -> players.add(player));
        monsterRepository.findAllMonsters().forEach(monster -> monsters.add(monster));
        buildingTileRepository.findAllBuildingTiles().forEach(buildingTile -> buildingTiles.add(buildingTile));
        streetTileRepository.findAllStreetTiles().forEach(streetTile -> streetTiles.add(streetTile));
        omenCardRepository.findAllOmenCards().forEach(omenCard -> omenCards.add(omenCard));
        eventCardRepository.findAllEventCards().forEach(eventCard -> eventCards.add(eventCard));
        this.board.add(elfsongTavern);
        elfsongTavern.setWest(innerChamber);
        this.board.add(innerChamber);
        innerChamber.setEast(elfsongTavern);
        innerChamber.setWest(kitchen);
        this.board.add(kitchen);
        kitchen.setEast(innerChamber);
    }
}
