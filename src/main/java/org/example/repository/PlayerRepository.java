package org.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class PlayerRepository {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbc_demo",
                    "postgres",
                    "Aman@15112003"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

