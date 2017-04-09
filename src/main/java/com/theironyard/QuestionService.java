package com.theironyard;

<<<<<<< HEAD
=======

import org.springframework.stereotype.Component;

>>>>>>> 6e56a3f6fda243ff85b48eb59206eed928d64aef
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

@Component
public class QuestionService {
    private IronCardsRepository ironCardsRepository;
    private Question oldQuestion;


    /**
     * Construct the QuestionService
     * @param ironCardsRepo to connect to the datbase
     */
    public QuestionService(IronCardsRepository ironCardsRepo) {
        this.ironCardsRepository = ironCardsRepo;
    }


<<<<<<< HEAD
    //Return a Random Question From Database
    public int questionCount() throws SQLException {
        return ironCardsRepository.getCount("questions");
    }

    public Question getRandomQuestion() throws SQLException {
        Random rand = new Random();
=======
    /**
     * Gets a random Question from the repository
     * Checks to make sure the question returned is not the same as the last question returned
     * @return Question
     * @throws SQLException if connection to database fails
     */
    public Question getRandomItem() throws SQLException {
>>>>>>> 6e56a3f6fda243ff85b48eb59206eed928d64aef
        Question question = null;
        ResultSet result = ironCardsRepository.getRandomItem("questions");
        while (result.next()) {
            question = new Question(
                    result.getInt("questionid"), result.getString("question"), result.getString("correctanswer"), result.getString("aanswer"), result.getString("banswer"), result.getString("canswer"), result.getString("danswer"));

        }
        if(question == oldQuestion) {
            return getRandomItem();
        }else {
            oldQuestion = question;
            return question;
        }
<<<<<<< HEAD
        return question;
=======

>>>>>>> 6e56a3f6fda243ff85b48eb59206eed928d64aef

    }

    }
