package com.example.capgemini.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee implements Comparable<Employee>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    private String name;
    private String email;
    private String phone;

    private LocalDateTime joinDate;

    private Double salary;
    private String address;
    private String deptName;

    private String role;
    private String password;

    private Integer age;
    private String gender;

    private Boolean active;

    private Double bonus;

    private Integer experienceYears;

    private String designation;

    @Override
    public int compareTo(Employee e){
        return this.salary.compareTo(e.salary);
    }
}
