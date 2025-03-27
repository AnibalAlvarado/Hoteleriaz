package com.sena.crud_basic.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.HotelDto;
import com.sena.crud_basic.model.Hotel;
import com.sena.crud_basic.service.HotelService;

@RestController
@RequestMapping({"/api/v1/Hotel"})
public class HotelController extends BaseModelController<Hotel,HotelDto> {

    public HotelController(HotelService hotelService){
        super(hotelService);
    }
}
