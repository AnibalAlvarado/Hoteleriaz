package com.sena.crud_basic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTOs.EmployeeDto;
import com.sena.crud_basic.model.Employee;
import com.sena.crud_basic.repository.IEmployeeRepository;

@Service
public class EmployeeService extends GenericService<Employee, EmployeeDto> {
    
    @Autowired
    private final IEmployeeRepository employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.repository = employeeRepository; 
    }

    @Override
    protected Employee convertToModel(EmployeeDto dto) {
        Employee employeeEntity = new Employee();
        dto.getId().ifPresent(employeeEntity::setId);
        dto.getName().ifPresent(employeeEntity::setName);
        dto.getRole().ifPresent(employeeEntity::setRole);
        return employeeEntity;
    }

    @Override
    protected EmployeeDto convertToDTO(Employee model) {
        EmployeeDto dto = new EmployeeDto();
        dto.setId(Optional.ofNullable(model.getId()));
        dto.setName(Optional.ofNullable(model.getName()));
        dto.setRole(Optional.ofNullable(model.getRole()));
        return dto;
    }
}
