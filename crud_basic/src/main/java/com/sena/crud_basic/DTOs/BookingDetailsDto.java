package com.sena.crud_basic.DTOs;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDetailsDto extends GenericDto {
    private Optional<Integer> Amount = Optional.empty();
    private Optional<Double> TotalPrice = Optional.empty();
    private Optional<Long> RoomId = Optional.empty();
    private Optional<Long> HotelId = Optional.empty();
    private Optional<Long> BookingId = Optional.empty();
}
