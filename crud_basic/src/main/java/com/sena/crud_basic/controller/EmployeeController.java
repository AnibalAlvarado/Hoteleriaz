package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.EmployeeDto;
import com.sena.crud_basic.model.Employee;
import com.sena.crud_basic.service.EmployeeService;

@RestController
@RequestMapping({"/api/v1/Employee"})
public class EmployeeController extends BaseModelController<Employee,EmployeeDto> {

    public EmployeeController(EmployeeService employeeService){
        super(employeeService);
    }
}
