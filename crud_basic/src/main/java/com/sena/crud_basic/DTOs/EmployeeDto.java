package com.sena.crud_basic.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto extends GenericDto {
    public EmployeeDto() {
    }
    public EmployeeDto(String name, String role) {
        Name = name;
        Role = role;
    }
    private String Name ;
    private String Role ;
}
