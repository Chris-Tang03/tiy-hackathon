package com.theironyard;

import java.sql.*;

/**
 * Created by forestnewark on 4/7/17.
 */
public class IronCardsRepository {

    private Connection conn;

    /**
     * AnimalRespository constructor
     * @param jdbcUrl to be used to connect to the database
     * @throws SQLException
     */
    public IronCardsRepository(String jdbcUrl) throws SQLException {
        this.conn = DriverManager.getConnection(jdbcUrl);
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

    /**
     * Counts the number of animals currently in the database
     * @return the current number of animals in the database
     * @throws SQLException
     */
    public int getCount(String tableName) throws SQLException {

        PreparedStatement preparedStatement = conn.prepareStatement("SELECT COUNT(*) AS total " +
                "FROM ? ");
        preparedStatement.setString(1, tableName);

        ResultSet result = preparedStatement.executeQuery();

        int total = 0;

        while(result.next()) {
            total = result.getInt("total");

        }
        return total;
    }






}
