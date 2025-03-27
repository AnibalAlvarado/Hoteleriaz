package com.sena.crud_basic.DTOs;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelDto extends GenericDto {
    public HotelDto() {
    }
    public HotelDto(String name, String address, String category) {
        Name = name;
        Address = address;
        Category = category;
    }
    private String Name;
    private String Address ;
    private String Category;
}
