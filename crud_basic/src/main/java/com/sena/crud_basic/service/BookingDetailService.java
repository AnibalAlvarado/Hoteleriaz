package com.sena.crud_basic.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sena.crud_basic.DTOs.BookingDetailsDto;
import com.sena.crud_basic.model.BookingDetail;
import com.sena.crud_basic.repository.IBookingDetailRepository;

public class BookingDetailService extends GenericService<BookingDetail,BookingDetailsDto> {
     @Autowired
     private final IBookingDetailRepository bookingDetailRepository;

     public BookingDetailService(IBookingDetailRepository bookingDetailRepository) {
         this.bookingDetailRepository = bookingDetailRepository;
         this.repository = bookingDetailRepository;
        }

    @Override
    protected BookingDetail convertToModel(BookingDetailsDto dto) {
       
        return new BookingDetail(
            0,
            dto.getAmount(),
            dto.getTotalPrice(),
            dto.getRoomId(),
            dto.getHotelId(),
            dto.getBookingId()
            );      
            
    }
    
    @Override
    protected BookingDetailsDto convertToDTO(BookingDetail model) {

        return new BookingDetailsDto(
            model.getAmount(),
            model.getTotalPrice(),
            model.getRoomId(),
            model.getHotelId(),
            model.getBookingId()
        );
    }
}
