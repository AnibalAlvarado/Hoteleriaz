package com.sena.crud_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTOs.BookingDto;
import com.sena.crud_basic.model.Booking;
import com.sena.crud_basic.repository.IBookingRepository;

@Service
public class BookingService extends GenericService<Booking,BookingDto>{
    
    @Autowired
     private final IBookingRepository bookingRepository;


    public BookingService(IBookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
        this.repository = bookingRepository;
    }

    @Override
    protected Booking convertToModel(BookingDto dto) {
       
        return new Booking(
            0,
            dto.getEndDate(),
            dto.getStartDate(),
            dto.getClientId()
            );      
            
    }
    
    @Override
    protected BookingDto convertToDTO(Booking model) {

        return new BookingDto(
            model.getStartDate(),
            model.getEndDate(),
            model.getClientsId()
        );
    }
}
