package com.sena.crud_basic.DTOs;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeHotelDto extends GenericDto {
    private Optional<Long> EmployeeId = Optional.empty();
    private Optional<Long> HotelId = Optional.empty();
}
