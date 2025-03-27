package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.EmployeeHotelDto;
import com.sena.crud_basic.model.EmployeeHotel;
import com.sena.crud_basic.service.EmployeeHotelService;

@RestController
@RequestMapping({"/api/v1/EmployeeHotel"})
public class EmployeeHotelController extends BaseModelController<EmployeeHotel,EmployeeHotelDto> {

    public EmployeeHotelController(EmployeeHotelService employeeHotelService){
        super(employeeHotelService);
    }
}
