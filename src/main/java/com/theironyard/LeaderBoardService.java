package com.theironyard;

import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


@Component
public class LeaderBoardService {


    //Declare variable for the Repository
    private IronCardsRepository ironCardsRepository;


    /**
     * constructor
     * @param ironCardsRepository that will make connection to the database
     */
    public LeaderBoardService(IronCardsRepository ironCardsRepository) {
        this.ironCardsRepository = ironCardsRepository;
    }


    public ArrayList<LeaderBoardRow> getLeaderBoard() throws SQLException {

        ArrayList<LeaderBoardRow> returnArray = new ArrayList<>();
        ResultSet result = ironCardsRepository.getAll("leaderboard");
        while(result.next()){
            LeaderBoardRow lbr = new LeaderBoardRow(result.getInt("leaderboardid"),result.getString("username"),result.getInt("score"));
            returnArray.add(lbr);
        }

        return returnArray;
    }


}
