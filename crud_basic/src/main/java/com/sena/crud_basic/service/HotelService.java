package com.sena.crud_basic.service;

import java.util.Optional;

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
        Hotel hotelEntity = new Hotel();
        dto.getId().ifPresent(hotelEntity::setId);
        dto.getName().ifPresent(hotelEntity::setName);
        dto.getAddress().ifPresent(hotelEntity::setAddress);
        return hotelEntity;
    }

    @Override
    protected HotelDto convertToDTO(Hotel model) {
        HotelDto dto = new HotelDto();
        dto.setId(Optional.ofNullable(model.getId()));
        dto.setName(Optional.ofNullable(model.getName()));
        dto.setAddress(Optional.ofNullable(model.getAddress()));
        return dto;
    }
}
