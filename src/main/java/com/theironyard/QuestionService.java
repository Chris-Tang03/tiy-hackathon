package com.theironyard;

import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;


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


    /**
     * Gets a random Question from the repository
     * Checks to make sure the question returned is not the same as the last question returned
     * @return Question
     * @throws SQLException if connection to database fails
     */
    public Question getRandomItem() throws SQLException {

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

    }

    }
