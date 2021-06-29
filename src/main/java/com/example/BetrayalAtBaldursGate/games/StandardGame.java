package com.example.BetrayalAtBaldursGate.games;

public class StandardGame extends GameState{

    private int omenCounter;

    public StandardGame(int roundCounter, int omenCounter) {
        super(roundCounter);
        this.omenCounter = 0;
    }

    public int getOmenCounter() {
        return omenCounter;
    }

    public void setOmenCounter(int omenCounter) {
        this.omenCounter = omenCounter;
    }
}
