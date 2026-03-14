package com.example.SpringBoot_InitialProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Panda {
    @Id
    private Integer id;
    private String name;
    private Double weight;
}
