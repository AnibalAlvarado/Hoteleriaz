package com.sena.crud_basic.service;
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
         return new Employee(
            0,
            dto.getName(),
            dto.getRole()
            );  
    }

    @Override
    protected EmployeeDto convertToDTO(Employee model) {
        
          return new EmployeeDto(
            model.getName(),
            model.getRole()
        );
    }
}
