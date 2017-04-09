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
 * RestController that returns JSON data containing all information for a single round of play
 * in the IronCards game
 */
@RestController
public class GamePlayDataController {

    private final AssignmentService assignmentService;
    private final QuestionService questionService;

    @Autowired
    public GamePlayDataController(AssignmentService assignmentService, QuestionService questionService) {
        this.assignmentService = assignmentService;
        this.questionService = questionService;
    }


    /**
     * Creates and returns a GamePlayData object which contains all of the specific information
     * related to a specific round of game play
     * @return
     * @throws SQLException
     */
    @RequestMapping(value = "/gamedata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GamePlayData> gameData() throws SQLException {

        Card card = new Card("LabTime",5,0);
        GamePlayData gamePlayData = new GamePlayData(assignmentService.getRandomItem(),questionService.getRandomItem(),card);
        return new ResponseEntity<>(gamePlayData, HttpStatus.OK);
    }




}
