package com.sena.crud_basic.DTOs;
import com.sena.crud_basic.model.Booking;
import com.sena.crud_basic.model.Hotel;
import com.sena.crud_basic.model.Room;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDetailsDto extends GenericDto {
    public BookingDetailsDto() {
    }
    public BookingDetailsDto(Double amount, Double totalPrice, Room roomId, Hotel hotelId, Booking bookingId) {
        Amount = amount;
        TotalPrice = totalPrice;
        RoomId = roomId;
        HotelId = hotelId;
        BookingId = bookingId;
    }
    private Double Amount ;
    private Double TotalPrice ;
    private Room RoomId ;
    private Hotel HotelId;
    private Booking BookingId ;
}
