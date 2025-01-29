package com.example.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private String position;

    // Getters and setters
}