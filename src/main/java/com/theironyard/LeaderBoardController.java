package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by forestnewark on 4/8/17.
 */
@RestController
public class LeaderBoardController {

    final
    LeaderBoardService leaderBoardService;

    @Autowired
    public LeaderBoardController(LeaderBoardService leaderBoardService) {
        this.leaderBoardService = leaderBoardService;
    }


    @RequestMapping(value = "/leaderboard", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LeaderBoard> gameData() throws SQLException {

        LeaderBoard leaderBoard = new LeaderBoard(leaderBoardService.getLeaderBoard());

        return new ResponseEntity<>(leaderBoard, HttpStatus.OK);
    }
}
