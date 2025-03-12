package com.sena.crud_basic.DTOs;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDto extends GenericDto {
    private Optional<String> StartDate = Optional.empty();
    private Optional<String> EndDate = Optional.empty();
    private Optional<Long> ClientId = Optional.empty();
}
