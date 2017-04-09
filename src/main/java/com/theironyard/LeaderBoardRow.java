package com.theironyard;

import org.springframework.stereotype.Component;

/**
 * Created by forestnewark on 4/8/17.
 */
@Component
public class LeaderBoardRow {

    private int leaderRank;
    private String name;
    private int score;

    public LeaderBoardRow(){}


    public LeaderBoardRow(int leaderRank, String name, int score) {
        this.leaderRank = leaderRank;
        this.name = name;
        this.score = score;
    }

    public int getLeaderRank() {
        return leaderRank;
    }

    public void setLeaderRank(int leaderRank) {
        this.leaderRank = leaderRank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
