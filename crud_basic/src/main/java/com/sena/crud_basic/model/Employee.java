package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Employees")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private String Name;
    private String Role;

    public Employee() {
    }

    public Employee(int id, String name, String role) {
        Id = id;
        Name = name;
        Role = role;
    }
}
        