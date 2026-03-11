package org.example;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jdbc_demo";
        String user = "postgres";
        String password = "Aman@15112003";

        try {
            // 1️⃣ Create connection
            Connection con = DriverManager.getConnection(url, user, password);

            // =========================
            // ✅ CREATE
            // =========================
            String insertSql = "INSERT INTO usersTable(name, email) VALUES (?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertSql);

            psInsert.setString(1, "Aman");
            psInsert.setString(2, "aman@gmail.com");
            psInsert.executeUpdate();
            psInsert.close();


            // =========================
            // ✅ UPDATE
            // =========================
            String updateSql = "UPDATE usersTable SET name=? WHERE email=?";
            PreparedStatement psUpdate = con.prepareStatement(updateSql);

            psUpdate.setString(1, "Aman Kumar");
            psUpdate.setString(2, "aman@gmail.com");
            psUpdate.executeUpdate();
            psUpdate.close();


            // =========================
            // ✅ DELETE (example optional)
            // =========================
            // Comment this if you want record visible at end
            /*
            String deleteSql = "DELETE FROM usersTable WHERE email=?";
            PreparedStatement psDelete = con.prepareStatement(deleteSql);

            psDelete.setString(1, "someone@gmail.com");
            psDelete.executeUpdate();
            psDelete.close();
            */


            // =========================
            // ⭐ FETCH AT LAST (READ FINAL STATE)
            // =========================
            String selectSql = "SELECT * FROM usersTable";
            PreparedStatement psSelect = con.prepareStatement(selectSql);

            ResultSet rs = psSelect.executeQuery();

            System.out.println("---- FINAL TABLE DATA ----");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " | " + name + " | " + email);
            }

            rs.close();
            psSelect.close();

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}