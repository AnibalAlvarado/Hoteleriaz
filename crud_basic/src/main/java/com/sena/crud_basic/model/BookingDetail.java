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
@Table(name = "BookingDetails")
@Getter
@Setter
public class BookingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private double Amount;
    private double TotalPrice;

    @ManyToOne
    @JoinColumn(name = "RoomId")
    private Room RoomId;

    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel HotelId;

    @ManyToOne
    @JoinColumn(name = "BookingId")
    private Booking BookingId;

    public BookingDetail() {
    }

    public BookingDetail(int id, double amount, double totalPrice, Room roomId, Hotel hotelId, Booking bookingId) {
        Id = id;
        Amount = amount;
        TotalPrice = totalPrice;
        RoomId = roomId;
        HotelId = hotelId;
        BookingId = bookingId;
    }
}
        