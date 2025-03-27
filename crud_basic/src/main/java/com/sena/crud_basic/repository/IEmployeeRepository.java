package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{

}
