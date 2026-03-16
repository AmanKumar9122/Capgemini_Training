package com.example.capgemini.comparator;
import com.example.capgemini.entity.Employee;
import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getSalary().compareTo(e2.getSalary());
    }
}
