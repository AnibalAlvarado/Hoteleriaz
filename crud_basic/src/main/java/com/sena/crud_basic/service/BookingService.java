package com.sena.crud_basic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTOs.BookingDto;
import com.sena.crud_basic.model.Booking;
import com.sena.crud_basic.model.client;
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
        Booking booking = new Booking();
        dto.getId().ifPresent(booking::setId);
        dto.getStartDate().ifPresent(booking::setStartDate);
        dto.getEndDate().ifPresent(booking::setEndDate);
        dto.getClientId().ifPresent(id -> {
            client clientEntity = new client();
            clientEntity.setId(id);
            booking.setClients(clientEntity);
        });
        return booking;
    }
    
    @Override
    protected BookingDto convertToDTO(Booking model) {
        BookingDto dto = new BookingDto();
        dto.setId(Optional.ofNullable(model.getId()));
        dto.setStartDate(Optional.ofNullable(model.getStartDate()));
        dto.setEndDate(Optional.ofNullable(model.getEndDate()));
        dto.setClientId(Optional.ofNullable(model.getClients()).map(client::getId));
        return dto;
    }
}
