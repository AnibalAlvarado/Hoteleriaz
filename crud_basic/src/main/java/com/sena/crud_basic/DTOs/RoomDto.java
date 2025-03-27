package com.sena.crud_basic.DTOs;
import com.sena.crud_basic.model.Hotel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomDto extends GenericDto {
    public RoomDto() {
    }
    public RoomDto(String type, Double price, Hotel hotelId) {
        HotelId = hotelId;
        Type = type;
        Price = price;
    }
    private String Type;
    private Double Price ;
    private Hotel HotelId;
}
