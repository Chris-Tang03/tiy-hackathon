package com.theironyard;

import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

@Component
public class AssignmentService {
    private IronCardsRepository ironCardsRepository;

    public AssignmentService(IronCardsRepository ironCardsRepository) {
        this.ironCardsRepository = ironCardsRepository;
    }

    public int assignmentCount() throws SQLException {
        return ironCardsRepository.getCount("assignment");
    }

    public Assignment getRandomItem() throws SQLException {
        Assignment assignment = null;
        ResultSet result = ironCardsRepository.getRandomItem("assignment");
        while (result.next()) {
            assignment = new Assignment(result.getString("name"), result.getInt("time"), result.getInt("points"));
        }
        return assignment;

    }



    public Assignment getRandomAssignment() throws SQLException {
        Random rand = new Random();
        Assignment assignment = null;

        ResultSet result = ironCardsRepository.getItem("assignment", "assignmentid", rand.nextInt(assignmentCount()) + 1);

        while (result.next()) {
            assignment = new Assignment(result.getString("name"), result.getInt("time"), result.getInt("points"));
        }
        return assignment;
    }


}
