package com.sena.crud_basic.DTOs;
import com.sena.crud_basic.model.Booking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceDto extends GenericDto {
    public InvoiceDto() {
    }
    public InvoiceDto(String date, double amount, Booking bookingId) {
        Date = date;
        Amount = amount;
        BookingId = bookingId;
    }
 
    private String Date;
    private double Amount;
    private Booking BookingId;
}
