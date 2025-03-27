package com.sena.crud_basic.DTOs;

import com.sena.crud_basic.model.Employee;
import com.sena.crud_basic.model.Hotel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeHotelDto extends GenericDto {
    public EmployeeHotelDto() {
    }
    public EmployeeHotelDto(Employee employeeId, Hotel hotelId) {
        EmployeeId = employeeId;
        HotelId = hotelId;
    }
    private Employee EmployeeId;
    private Hotel HotelId ;
}
