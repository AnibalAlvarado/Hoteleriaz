package com.sena.crud_basic.DTOs;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelDto extends GenericDto {
    private Optional<String> Name = Optional.empty();
    private Optional<String> Address = Optional.empty();
}
