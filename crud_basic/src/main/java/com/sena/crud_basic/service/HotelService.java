package com.sena.crud_basic.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.crud_basic.DTOs.HotelDto;
import com.sena.crud_basic.model.Hotel;
import com.sena.crud_basic.repository.IHotelRepository;

@Service
public class HotelService extends GenericService<Hotel,HotelDto> {

    @Autowired
    private final IHotelRepository hotelRepository;

    public HotelService(IHotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
        this.repository = hotelRepository; 
    }

     @Override
    protected Hotel convertToModel(HotelDto dto) {
         return new Hotel(
            0,
            dto.getName(),
            dto.getAddress(),
            dto.getCategory()
            );  
    }

    @Override
    protected HotelDto convertToDTO(Hotel model) {
        return new HotelDto(
            model.getName(),
            model.getAddress(),
            model.getCategory()
        );
    }
}
