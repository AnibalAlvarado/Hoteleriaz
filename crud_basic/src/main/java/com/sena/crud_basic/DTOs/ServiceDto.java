package com.sena.crud_basic.DTOs;
import java.util.Optional;
import com.sena.crud_basic.model.Hotel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDto extends GenericDto{
    public ServiceDto() {
    }
    public ServiceDto(String name, Optional<String> description, Hotel hotelId) {
        Name = name;
        Description = description;
        HotelId = hotelId;
    }
    private String Name;
    private Optional<String> Description = Optional.empty();
    private Hotel HotelId;
}
