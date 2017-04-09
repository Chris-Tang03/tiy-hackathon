package com.theironyard;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LeaderBoardService {


    private IronCardsRepository repository;



    public LeaderBoardService(IronCardsRepository repo){
        this.repository = repo;
    }




    //Provides a list of all animals currently in the database
    public ArrayList<LeaderBoard> getLeaderBoard() throws SQLException {
        ArrayList<LeaderBoard> lb = new ArrayList<>();

        ResultSet result = this.repository.getAll("leaderboard");

        while(result.next()) {
            LeaderBoard leaderBoard = new LeaderBoard(
                    result.getInt("leaderboardid"),
                    result.getString("username"),
                    result.getInt("score")
            );
            lb.add(leaderBoard);
        }

        return lb;
    }


}
