package com.sena.crud_basic.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sena.crud_basic.DTOs.EmployeeHotelDto;
import com.sena.crud_basic.model.EmployeeHotel;
import com.sena.crud_basic.repository.IEmployeeHotelRepository;

public class EmployeeHotelService extends GenericService<EmployeeHotel,EmployeeHotelDto> {
     @Autowired
     private final IEmployeeHotelRepository employeeHotelRepository;


    public EmployeeHotelService(IEmployeeHotelRepository employeeHotelRepository) {
        this.employeeHotelRepository = employeeHotelRepository;
        this.repository = employeeHotelRepository;
    }

    @Override
    protected EmployeeHotel convertToModel(EmployeeHotelDto dto) {
       
        return new EmployeeHotel(
            0,
            dto.getEmployeeId(),
            dto.getHotelId()
            );      
            
    }
    
    @Override
    protected EmployeeHotelDto convertToDTO(EmployeeHotel model) {

        return new EmployeeHotelDto(
            model.getEmployeeId(),
            model.getHotelId()
        );
    }
}
