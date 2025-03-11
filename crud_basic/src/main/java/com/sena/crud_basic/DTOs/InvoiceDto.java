package com.sena.crud_basic.DTOs;

import java.time.LocalDateTime;
import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceDto extends GenericDto {
    private Optional<LocalDateTime> Date = Optional.empty();
    private Optional<Double> TotalAmount = Optional.empty();
    private Optional<Long> BookingId = Optional.empty();
}
