package com.sena.crud_basic.DTOs;
import com.sena.crud_basic.model.Invoice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDto extends GenericDto {
    public PaymentDto() {
    }
    public PaymentDto(Invoice invoiceId, String typePayment, Double amount) {
        InvoiceId = invoiceId;
        TypePayment = typePayment;
        Amount = amount;
    }
    private String TypePayment ;
    private Double Amount;
    private Invoice InvoiceId ;
}
