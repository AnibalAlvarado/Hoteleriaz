package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EmployeeHotels")
@Getter
@Setter
public class EmployeeHotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    @ManyToOne
    @JoinColumn(name = "EmployeeId")
    private Employee EmployeeId;

    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel HotelId;

    public EmployeeHotel(int id, Employee employeeId, Hotel hotelId) {
        Id = id;
        EmployeeId = employeeId;
        HotelId = hotelId;
    }

    public EmployeeHotel() {
    }

    
}