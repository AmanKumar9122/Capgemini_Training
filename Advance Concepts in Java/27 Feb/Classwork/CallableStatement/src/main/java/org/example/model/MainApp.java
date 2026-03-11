package org.example.model;

public class MainApp {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.insertEmployee("user",123.23);
    }
}
