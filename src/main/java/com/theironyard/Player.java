package com.theironyard;

/**
 * Created by forestnewark on 4/6/17.
 */

public class Player {

    //Properties
    private String playerName;
    private int points;
    private int time;
    private int skill;

    //No-Argument Constructor for Spring
    public Player() {}

    //Constructor with arguments
    public Player(String playerName, int time, int skill) {
        this.playerName = playerName;
        this.time = time;
        this.skill = skill;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
