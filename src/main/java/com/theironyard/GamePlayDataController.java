package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by forestnewark on 4/7/17.
 */
@RestController
public class GamePlayDataController {

    @Autowired
    private AssignmentService assignmentService;
    @Autowired
    private QuestionService questionService;



    //Request all the goodness

    @RequestMapping(value = "/gamedata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GamePlayData> gameData() throws SQLException {

        Assignment assignment = new Assignment("AssignmentTestName",10,25);
        Question question = new Question(1,"What is the meaing of life?","b","No One Know","42","Cake","Music");
        Card card = new Card("LabTime",5,0);
        GamePlayData gamePlayData = new GamePlayData(assignmentService.getRandomItem(),questionService.getRandomItem(),card);
        return new ResponseEntity<>(gamePlayData, HttpStatus.OK);
    }




}
