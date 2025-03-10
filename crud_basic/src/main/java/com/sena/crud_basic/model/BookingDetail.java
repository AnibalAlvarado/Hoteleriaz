package com.sena.crud_basic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BookingDetails")
@Getter
@Setter
public class BookingDetail extends GenericModel {
    private int Amount;
    private double TotalPrice;
    
    @ManyToOne
    @JoinColumn(name = "RoomId")
    private Room Room;
    
    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel Hotel;
    
    @ManyToOne
    @JoinColumn(name = "BookingId")
    private Booking Booking;
}
