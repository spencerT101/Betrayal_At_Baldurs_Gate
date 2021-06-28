package com.example.BetrayalAtBaldursGate.characters;

public abstract class Character {

    private String name;
    private int might;
    private int speed;
    private int sanity;
    private int knowledge;
    private String species;

    public Character(String name, int might, int speed, int sanity, int knowledge, String species) {
        this.name = name;
        this.might = might;
        this.speed = speed;
        this.sanity = sanity;
        this.knowledge = knowledge;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
