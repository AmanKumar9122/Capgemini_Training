package com.example.capgemini.controller;
import com.example.capgemini.dto.LoginRequest;
import com.example.capgemini.entity.Employee;
import com.example.capgemini.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/register")
    public Employee register(@RequestBody Employee employee){
        return service.registerEmployee(employee);
    }

    @PostMapping("/login")
    public Employee login(@RequestBody LoginRequest request){
        return service.login(request.getEmail(),request.getPassword());
    }

    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAll(){
        return service.getAllEmployees();
    }

    @GetMapping("/salary/{salary}")
    public List<Employee> highSalary(@PathVariable Double salary){
        return service.getEmployeesWithHighSalary(salary);
    }

    @GetMapping("/department/{dept}")
    public List<Employee> byDepartment(@PathVariable String dept){
        return service.getEmployeesByDepartment(dept);
    }

    @GetMapping("/top/{limit}")
    public List<Employee> topEmployees(@PathVariable int limit){
        return service.getTopHighestPaidEmployees(limit);
    }
}