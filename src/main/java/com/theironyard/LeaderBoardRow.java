package com.theironyard;

/**
 * Created by forestnewark on 4/8/17.
 */
public class LeaderBoardRow {

    private int leaderRank;
    private String name;
    private int string;

    public LeaderBoardRow(){}


    public LeaderBoardRow(int leaderRank, String name, int string) {
        this.leaderRank = leaderRank;
        this.name = name;
        this.string = string;
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

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }
}
