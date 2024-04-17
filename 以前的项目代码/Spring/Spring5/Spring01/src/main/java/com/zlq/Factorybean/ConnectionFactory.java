package com.zlq.Factorybean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 实例工厂，
 * ConnectionFactory cf = new ConnectionFactory();
 * cf.getConnection();
 *静态工厂
 *staticConnectionFactory.getConnection();
 */
public class ConnectionFactory {
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "admin11");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
