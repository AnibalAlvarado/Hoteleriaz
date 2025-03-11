package com.sena.crud_basic.DTOs;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDto extends GenericDto {
    private Optional<Long> InvoiceId = Optional.empty();
    private Optional<String> TypePayment = Optional.empty();
    private Optional<Double> Amount = Optional.empty();
}
