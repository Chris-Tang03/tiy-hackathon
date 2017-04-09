package com.theironyard;


public class Player {

    //Properties
    private String playerName;
    private int score;


    //No-Argument Constructor for Spring
    public Player() {}

    //Constructor with arguments
    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;


    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int points) {
        this.score = points;
    }
}
