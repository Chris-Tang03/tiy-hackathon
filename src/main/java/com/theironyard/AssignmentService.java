package com.theironyard;

import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

@Component
public class AssignmentService {

    //Declare variable for the Repository
    private IronCardsRepository ironCardsRepository;


    /**
     * AssignmentService constructor
     * @param ironCardsRepository that will make connection to the database
     */
    public AssignmentService(IronCardsRepository ironCardsRepository) {
        this.ironCardsRepository = ironCardsRepository;
    }


    /**
     * Gets a single, random assignment from the repository
     * @return Assignment
     * @throws SQLException if connection to database fails
     */
    public Assignment getRandomItem() throws SQLException {
        Assignment assignment = null;
        ResultSet result = ironCardsRepository.getRandomItem("assignment");
        while (result.next()) {
            assignment = new Assignment(result.getString("name"), result.getInt("time"), result.getInt("points"));
        }
        return assignment;

    }

}
