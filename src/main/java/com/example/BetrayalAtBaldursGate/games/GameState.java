package com.example.BetrayalAtBaldursGate.games;

import com.example.BetrayalAtBaldursGate.cards.EventCard;
import com.example.BetrayalAtBaldursGate.cards.OmenCard;
import com.example.BetrayalAtBaldursGate.characters.Hero;
import com.example.BetrayalAtBaldursGate.tiles.BuildingTile;
import com.example.BetrayalAtBaldursGate.tiles.StreetTile;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public abstract class GameState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "round_counter")
    private int roundCounter;

    @JsonIgnoreProperties(value="game_state")
    @OneToMany(mappedBy = "game_state", fetch = FetchType.LAZY )
    private List<Hero> players;

    @JsonIgnoreProperties(value="game_state")
    @OneToMany(mappedBy = "game_state", fetch = FetchType.LAZY )
    private List<BuildingTile> buildingTiles;

    @JsonIgnoreProperties(value="game_state")
    @OneToMany(mappedBy = "game_state", fetch = FetchType.LAZY )
    private List<StreetTile>streetTiles;

    @JsonIgnoreProperties(value="game_state")
    @OneToMany(mappedBy = "game_state", fetch = FetchType.LAZY )
    private List<OmenCard> omenCards;

    @JsonIgnoreProperties(value="game_state")
    @OneToMany(mappedBy = "game_state", fetch = FetchType.LAZY )
    private List<EventCard>eventCards;


    public GameState() {
        this.roundCounter = 0;
        this.players = new ArrayList<>();
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Hero> getPlayers() {
        return players;
    }

    public void setPlayers(List<Hero> players) {
        this.players = players;
    }

    public List<BuildingTile> getBuildingTiles() {
        return buildingTiles;
    }

    public void setBuildingTiles(List<BuildingTile> buildingTiles) {
        this.buildingTiles = buildingTiles;
    }

    public List<StreetTile> getStreetTiles() {
        return streetTiles;
    }

    public void setStreetTiles(List<StreetTile> streetTiles) {
        this.streetTiles = streetTiles;
    }

    public List<OmenCard> getOmenCards() {
        return omenCards;
    }

    public void setOmenCards(List<OmenCard> omenCards) {
        this.omenCards = omenCards;
    }

    public List<EventCard> getEventCards() {
        return eventCards;
    }

    public void setEventCards(List<EventCard> eventCards) {
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
