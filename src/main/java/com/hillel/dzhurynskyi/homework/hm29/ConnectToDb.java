package com.hillel.dzhurynskyi.homework.hm29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDb {
    public static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    private ConnectToDb() {
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
