package com.theironyard;

/**
 * Created by forestnewark on 4/7/17.
 */
public class LeaderBoard {

    private int rank;
    private String userName;
    private int score;

    public LeaderBoard(){}

    public LeaderBoard(int rank, String userName, int score) {
        this.rank = rank;
        this.userName = userName;
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
