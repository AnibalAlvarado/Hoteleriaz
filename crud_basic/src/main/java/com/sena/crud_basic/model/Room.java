package com.sena.crud_basic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Rooms")
@Getter
@Setter
public class Room extends GenericModel {
    private String Type;
    private double Price;
    
    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel Hotel;
}
