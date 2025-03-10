package com.sena.crud_basic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Employees")
@Getter
@Setter
public class Employee extends GenericModel {
    private String Name;
    private String Role;
}
