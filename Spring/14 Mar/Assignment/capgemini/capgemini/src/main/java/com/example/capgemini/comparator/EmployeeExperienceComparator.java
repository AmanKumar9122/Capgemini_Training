package com.example.capgemini.comparator;
import com.example.capgemini.entity.Employee;
import java.util.Comparator;

public class EmployeeExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getExperienceYears().compareTo(e2.getExperienceYears());
    }
}