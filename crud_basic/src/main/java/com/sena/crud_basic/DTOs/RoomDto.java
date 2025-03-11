package com.sena.crud_basic.DTOs;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomDto extends GenericDto {
    private Optional<Long> HotelId = Optional.empty();
    private Optional<String> Type = Optional.empty();
    private Optional<Double> Price = Optional.empty();
}
