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

    private final CardService cardService;
    private final AssignmentService assignmentService;
    private final QuestionService questionService;

    @Autowired
    public GamePlayDataController(AssignmentService assignmentService, QuestionService questionService, CardService cardService) {
        this.assignmentService = assignmentService;
        this.questionService = questionService;
        this.cardService = cardService;
    }


    /**
     * Creates and returns a GamePlayData object which contains all of the specific information
     * related to a specific round of game play
     * @return
     * @throws SQLException
     */
    @RequestMapping(value = "/gamedata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GamePlayData> gameData() throws SQLException {

        Assignment assignment = new Assignment("AssignmentTestName",10,25);
        Question question = new Question(1,"What is the meaning of life?","b","No One Know","42","Cake","Music");
        Card card = new Card("LabTime",5,0);
        GamePlayData gamePlayData = new GamePlayData(assignmentService.getRandomItem(),questionService.getRandomItem(),cardService.getRandomCard());
        return new ResponseEntity<>(gamePlayData, HttpStatus.OK);
    }




}
