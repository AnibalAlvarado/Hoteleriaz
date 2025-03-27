package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.BookingDetailsDto;
import com.sena.crud_basic.model.BookingDetail;
import com.sena.crud_basic.service.BookingDetailService;

@RestController
@RequestMapping({"/api/v1/BookingDetail"})
public class BookingDetailController extends BaseModelController<BookingDetail,BookingDetailsDto> {

    public BookingDetailController(BookingDetailService bookingDetailService){
        super(bookingDetailService);
    }
}
