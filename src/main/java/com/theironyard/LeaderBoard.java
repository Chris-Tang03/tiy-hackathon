package com.theironyard;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by forestnewark on 4/8/17.
 */
@Component
public class LeaderBoard {

    private ArrayList<LeaderBoardRow> leaderBoard;

    public LeaderBoard(){}

    public LeaderBoard(ArrayList<LeaderBoardRow> leaderBoard) {
        this.leaderBoard = leaderBoard;
    }

    public ArrayList<LeaderBoardRow> getLeaderBoard() {
        return leaderBoard;
    }

    public void setLeaderBoard(ArrayList<LeaderBoardRow> leaderBoard) {
        this.leaderBoard = leaderBoard;
    }
}
