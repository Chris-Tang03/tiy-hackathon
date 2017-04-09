package com.theironyard;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class QuestionService {
    private IronCardsRepository ironCardsRepository;

    // Ironcards repo constructor
    public QuestionService(IronCardsRepository ironCardsRepo) {
        this.ironCardsRepository = ironCardsRepo;
    }


    //Return a Random Question From Database
    public int questionCount() throws SQLException {
        return ironCardsRepository.getCount("questions");
    }

    public Question getRandomQuestion() throws SQLException {
        Random rand = new Random();
        Question question = null;

        ResultSet result = ironCardsRepository.getItem("questions", "questionid", rand.nextInt(questionCount())+1);

        while(result.next()){
            question = new Question(result.getInt("questionid"), result.getString("question"), result.getString("correctanswer"), result.getString("aanswer"), result.getString("banswer"), result.getString("canswer"), result.getString("danswer"));
        }
        return question;

    }


}
