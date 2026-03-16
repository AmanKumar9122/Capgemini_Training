package com.example.capgemini.service;

import com.example.capgemini.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee registerEmployee(Employee employee);

    Employee login(String email,String password);

    String logout(Integer empId);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Integer empId,Employee employee);

    void deleteEmployee(Integer empId);

    Optional<Employee> getEmployeeById(Integer empId);

    List<Employee> getAllEmployees();

    String changeEmployeeRole(Integer empId,String role);

    List<Employee> getEmployeesByRole(String role);

    List<Employee> sortEmployeesBySalaryComparable();

    List<Employee> sortEmployeesByName();

    List<Employee> sortEmployeesBySalary();

    List<Employee> sortEmployeesByExperience();

    List<Employee> getEmployeesWithHighSalary(Double salary);

    List<Employee> getEmployeesByDepartment(String deptName);

    List<Employee> getEmployeesJoinedAfterYear(int year);

    Double getTotalSalaryExpense();

    Double getAverageSalary();

    List<Employee> getTopHighestPaidEmployees(int limit);

    List<Employee> getEmployeesWithExperienceGreaterThan(int years);

    List<String> getAllEmployeeNames();

    Long countEmployeesByDepartment(String deptName);
}
