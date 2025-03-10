package com.sena.crud_basic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Payments")
@Getter
@Setter
public class Payment extends GenericModel {
    private String TypePayment;
    private double Amount;
    
    @ManyToOne
    @JoinColumn(name = "InvoiceId")
    private Invoice Invoice;
}