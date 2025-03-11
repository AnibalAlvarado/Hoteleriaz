package com.sena.crud_basic.DTOs;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDto extends GenericDto{
    private Optional<String> Name = Optional.empty();
    private Optional<String> Description = Optional.empty();
    private Optional<Long> HotelId = Optional.empty();
}
