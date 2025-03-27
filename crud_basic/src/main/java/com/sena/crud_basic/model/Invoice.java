package com.sena.crud_basic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Invoice{
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private String Date;
    private double Amount;

    @ManyToOne
    @JoinColumn(name = "BookingId")
    private Booking BookingId;

    @OneToMany(mappedBy = "Invoice")
    private List<Payment> Payments;

    public Invoice() {
    }

    public Invoice(int id, String date, double amount, Booking bookingId) {
        Id = id;
        Date = date;
        Amount = amount;
        BookingId = bookingId;
    }

}