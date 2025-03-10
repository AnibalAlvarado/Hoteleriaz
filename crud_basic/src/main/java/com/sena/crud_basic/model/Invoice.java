package com.sena.crud_basic.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Invoices")
@Getter
@Setter
public class Invoice extends GenericModel {
    private String Date;
    private double Decimal;
    
    @ManyToOne
    @JoinColumn(name = "BookingId")
    private Booking Booking;
    
    @OneToMany(mappedBy = "Invoice")
    private List<Payment> Payments;
}