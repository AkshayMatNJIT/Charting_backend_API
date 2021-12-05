package com.digitalhealthapp.charting.dao.impl;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {

    private String url = "jdbc:mysql://cs673-prac-mgmt-portal.mysql.database.azure.com/practice_management_portal";

    private String username = "pmp_development";

    private String password = "PASSword@123";

    private static JDBCConnector connector;

    private JDBCConnector() {
    }

    public static JDBCConnector getInstance() {
        if (connector == null)
            connector = new JDBCConnector();
        return connector;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(this.url, this.username, this.password);
    }

}
