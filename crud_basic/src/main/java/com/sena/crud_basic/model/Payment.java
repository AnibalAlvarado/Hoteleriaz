package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Payments")
@Getter
@Setter
public class Payment {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private String TypePayment;
    private double Amount;

    @OneToOne
    @JoinColumn(name = "InvoiceId")
    private Invoice InvoiceId;

    public Payment() {
    }

    public Payment(int id, String typePayment, double amount, Invoice invoiceId) {
        Id = id;
        TypePayment = typePayment;
        Amount = amount;
        InvoiceId = invoiceId;
    }

}