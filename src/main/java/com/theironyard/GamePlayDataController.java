package com.theironyard;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by forestnewark on 4/7/17.
 */
@RestController
public class GamePlayDataController {


    //Request all the goodness

    @RequestMapping(value = "/gamedata", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GamePlayData> gameData() {

        Assignment assignment = new Assignment("AssignmentTestName",10,25);
        Question question = new Question(1,"What is the meaning of life?","b","No One Know","42","Cake","Music");
        Card card = new Card("LabTime",5,0);
        GamePlayData gamePlayData = new GamePlayData(assignment,question,card);
        return new ResponseEntity<>(gamePlayData, HttpStatus.OK);
    }




}
