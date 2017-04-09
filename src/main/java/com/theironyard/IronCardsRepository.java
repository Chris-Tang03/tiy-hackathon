package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class IronCardsRepository {


    private Connection conn;


    public IronCardsRepository() throws SQLException {
        this.conn = DriverManager.getConnection("jdbc:postgresql://localhost/ironcards");
    }

    //Returns all values in a table as a ResultSet
    public ResultSet getAll(String tableName) throws SQLException {
        // create a prepared statement
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * " +
                "FROM " + tableName);


        return preparedStatement.executeQuery();
    }


    public ResultSet getRandomItem(String tableName) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM " + tableName + " ORDER BY RANDOM() LIMIT 1");

        return preparedStatement.executeQuery();
    }





}
