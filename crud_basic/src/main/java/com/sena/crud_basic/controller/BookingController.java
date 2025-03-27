package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.BookingDto;
import com.sena.crud_basic.model.Booking;
import com.sena.crud_basic.service.BookingService;


@RestController
@RequestMapping({"/api/v1/Booking"})
public class BookingController extends BaseModelController<Booking, BookingDto>
{
     // El constructor recibe un servicio de tipo BookingService que será pasado a la clase base
     public BookingController(BookingService bookingService) {
         super(bookingService);
     }
}
