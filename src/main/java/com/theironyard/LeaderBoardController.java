package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 * Created by forestnewark on 4/8/17.
 */
@RestController
public class LeaderBoardController {

    final
    IronCardsRepository ironCardsRepository;

    final
    LeaderBoardService leaderBoardService;

    @Autowired
    public LeaderBoardController(LeaderBoardService leaderBoardService, IronCardsRepository ironCardsRepository) {
        this.leaderBoardService = leaderBoardService;
        this.ironCardsRepository = ironCardsRepository;
    }


    @RequestMapping(value = "/leaderboard", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LeaderBoard> gameData() throws SQLException {

        LeaderBoard leaderBoard = new LeaderBoard(leaderBoardService.getLeaderBoard());

        return new ResponseEntity<>(leaderBoard, HttpStatus.OK);
    }

    @RequestMapping(value = "/leaderboardadd", method = RequestMethod.POST)
    public ResponseEntity<Player> addToLeaderBoard(@RequestParam("playerName") String playerName,@RequestParam("score") int score) throws SQLException {

        Player player = new Player(playerName,score);

        ironCardsRepository.addToLeaderBoard(player);
        return new ResponseEntity<>(player, HttpStatus.OK);

    }


}
