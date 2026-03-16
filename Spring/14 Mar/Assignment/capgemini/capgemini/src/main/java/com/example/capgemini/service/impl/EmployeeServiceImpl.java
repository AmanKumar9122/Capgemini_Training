package com.example.capgemini.service.impl;

import com.example.capgemini.comparator.EmployeeExperienceComparator;
import com.example.capgemini.comparator.EmployeeNameComparator;
import com.example.capgemini.comparator.EmployeeSalaryComparator;
import com.example.capgemini.entity.Employee;
import com.example.capgemini.exception.EmployeeNotFoundException;
import com.example.capgemini.repository.EmployeeRepository;
import com.example.capgemini.service.EmployeeService;
import com.example.capgemini.util.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private SessionManager sessionManager;

    public Employee registerEmployee(Employee employee){
        return repository.save(employee);
    }

    public Employee login(String email,String password){
        Employee emp=repository.findByEmail(email)
                .orElseThrow(() -> new EmployeeNotFoundException("Invalid Email"));

        if(!emp.getPassword().equals(password))
            throw new RuntimeException("Invalid Password");

        sessionManager.login(emp.getEmpId());
        return emp;
    }

    public String logout(Integer empId){
        sessionManager.logout(empId);
        return "Logged out";
    }

    public Employee addEmployee(Employee employee){
        return repository.save(employee);
    }

    public Employee updateEmployee(Integer empId,Employee employee){
        Employee existing=repository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));

        existing.setName(employee.getName());
        existing.setSalary(employee.getSalary());
        existing.setDeptName(employee.getDeptName());

        return repository.save(existing);
    }

    public void deleteEmployee(Integer empId){
        repository.deleteById(empId);
    }

    public Optional<Employee> getEmployeeById(Integer empId){
        return repository.findById(empId);
    }

    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }

    public String changeEmployeeRole(Integer empId,String role){
        Employee emp=repository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));

        emp.setRole(role);
        repository.save(emp);
        return "Role Updated";
    }

    public List<Employee> getEmployeesByRole(String role){
        return repository.findByRole(role);
    }

    public List<Employee> sortEmployeesBySalaryComparable(){
        List<Employee> list=repository.findAll();
        Collections.sort(list);
        return list;
    }

    public List<Employee> sortEmployeesByName(){
        return repository.findAll().stream()
                .sorted(new EmployeeNameComparator())
                .toList();
    }

    public List<Employee> sortEmployeesBySalary(){
        return repository.findAll().stream()
                .sorted(new EmployeeSalaryComparator())
                .toList();
    }

    public List<Employee> sortEmployeesByExperience(){
        return repository.findAll().stream()
                .sorted(new EmployeeExperienceComparator())
                .toList();
    }

    public List<Employee> getEmployeesWithHighSalary(Double salary){
        return repository.findAll().stream()
                .filter(e -> e.getSalary() > salary)
                .toList();
    }

    public List<Employee> getEmployeesByDepartment(String deptName){
        return repository.findByDeptName(deptName);
    }

    public List<Employee> getEmployeesJoinedAfterYear(int year){
        return repository.findAll().stream()
                .filter(e -> e.getJoinDate().getYear() > year)
                .toList();
    }

    public Double getTotalSalaryExpense(){
        return repository.findAll().stream()
                .map(Employee::getSalary)
                .reduce(0.0,Double::sum);
    }

    public Double getAverageSalary(){
        return repository.findAll().stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }

    public List<Employee> getTopHighestPaidEmployees(int limit){
        return repository.findAll().stream()
                .sorted((a,b) -> b.getSalary().compareTo(a.getSalary()))
                .limit(limit)
                .toList();
    }

    public List<Employee> getEmployeesWithExperienceGreaterThan(int years){
        return repository.findAll().stream()
                .filter(e -> e.getExperienceYears() > years)
                .toList();
    }

    public List<String> getAllEmployeeNames(){
        return repository.findAll().stream()
                .map(Employee::getName)
                .toList();
    }

    public Long countEmployeesByDepartment(String deptName){
        return repository.findAll().stream()
                .filter(e -> e.getDeptName().equalsIgnoreCase(deptName))
                .count();
    }
}
