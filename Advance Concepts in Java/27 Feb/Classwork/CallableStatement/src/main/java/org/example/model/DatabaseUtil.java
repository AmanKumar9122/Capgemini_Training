package org.example.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {

    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fis =
                     new FileInputStream("D:\\coding\\CallableStatement\\src\\main\\java\\org\\example\\anything.properties")) {

            properties.load(fis);

            validate();

        } catch (IOException e) {
            throw new RuntimeException("Failed to load DB properties", e);
        }
    }

    private static void validate() {
        if (properties.getProperty("db.url") == null ||
                properties.getProperty("db.user") == null ||
                properties.getProperty("db.password") == null) {

            throw new RuntimeException("Missing DB configuration");
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                properties.getProperty("db.url"),
                properties.getProperty("db.user"),
                properties.getProperty("db.password")
        );
    }
}