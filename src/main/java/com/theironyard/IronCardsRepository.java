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
                "FROM ? ");
        preparedStatement.setString(1, tableName);

        return preparedStatement.executeQuery();
    }

    //Return a specific value from a specific table
    public ResultSet getItem(String tableName,String idName,Integer id) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * " +
                "FROM ? "+
                "WHERE ? = ?");
        preparedStatement.setString(1, tableName);
        preparedStatement.setString(2, idName);
        preparedStatement.setInt(3, id);

        return preparedStatement.executeQuery();

    }

    public ResultSet getRandomItem(String tableName) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM " + tableName + " ORDER BY RANDOM() LIMIT 1");

        return preparedStatement.executeQuery();
    }

    /**
     * Counts the number of animals currently in the database
     * @return the current number of animals in the database
     * @throws SQLException
     */
    public int getCount(String tableName) throws SQLException {

        PreparedStatement preparedStatement = conn.prepareStatement("SELECT COUNT(*) AS total " +
                "FROM ?");
        preparedStatement.setString(1, tableName);

        ResultSet result = preparedStatement.executeQuery();

        int total = 0;

        while(result.next()) {
            total = result.getInt("total");

        }
        return total;
    }



}
