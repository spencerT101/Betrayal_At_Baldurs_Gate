package com.example.BetrayalAtBaldursGate.characters;


public class Hero extends Character {

    private int maxMight;
    private int maxSpeed;
    private int maxSanity;
    private int maxKnowledge;

    public Hero(String name, int might, int speed, int sanity, int knowledge, String species, int maxMight, int maxSpeed, int maxSanity, int maxKnowledge, String image) {
        super(name, might, speed, sanity, knowledge, species, image);
        this.maxMight = maxMight;
        this.maxSpeed = maxSpeed;
        this.maxSanity = maxSanity;
        this.maxKnowledge = maxKnowledge;
    }

    public int getMaxMight() {
        return maxMight;
    }

    public void setMaxMight(int maxMight) {
        this.maxMight = maxMight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSanity() {
        return maxSanity;
    }

    public void setMaxSanity(int maxSanity) {
        this.maxSanity = maxSanity;
    }

    public int getMaxKnowledge() {
        return maxKnowledge;
    }

    public void setMaxKnowledge(int maxKnowledge) {
        this.maxKnowledge = maxKnowledge;
    }
}
