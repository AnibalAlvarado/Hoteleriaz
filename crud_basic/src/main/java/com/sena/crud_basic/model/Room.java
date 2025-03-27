package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Rooms")
@Getter
@Setter
public class Room {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private String Type;
    private double Price;

    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel HotelId;

    public Room() {
    }

    public Room(int id, String type, double price, Hotel hotelId) {
        Id = id;
        Type = type;
        Price = price;
        HotelId = hotelId;
    }

}
