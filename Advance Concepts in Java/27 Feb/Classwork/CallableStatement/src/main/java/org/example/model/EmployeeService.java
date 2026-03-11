package org.example.model;

import java.sql.CallableStatement;
import java.sql.Connection;

public class EmployeeService {
    public void insertEmployee(String name, double salary){
        String sql = "CALL InsertEmployee(?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
             CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setString(1, name);
            stmt.setDouble(2, salary);
            stmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}