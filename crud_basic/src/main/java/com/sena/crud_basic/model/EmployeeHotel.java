package com.sena.crud_basic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EmployeeHotels")
@Getter
@Setter
public class EmployeeHotel extends GenericModel {
    @ManyToOne
    @JoinColumn(name = "EmployeeId")
    private Employee Employee;
    
    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel Hotel;
}