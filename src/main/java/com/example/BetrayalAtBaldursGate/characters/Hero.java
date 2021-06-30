package com.example.BetrayalAtBaldursGate.characters;
import javax.persistence.*;


@Entity
@Table(name = "heroes")
public class

Hero extends Character {

    @Column(name = "max_might")
    private int maxMight;

    @Column(name = "max_speed")
    private int maxSpeed;

    @Column(name = "max_sanity")
    private int maxSanity;

    @Column(name = "max_knowledge")
    private int maxKnowledge;

    public Hero(String name, int might, int speed, int sanity, int knowledge, String species, int maxMight, int maxSpeed, int maxSanity, int maxKnowledge, String image) {
        super(name, might, speed, sanity, knowledge, species, image);
        this.maxMight = maxMight;
        this.maxSpeed = maxSpeed;
        this.maxSanity = maxSanity;
        this.maxKnowledge = maxKnowledge;
    }

    public Hero() {
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
