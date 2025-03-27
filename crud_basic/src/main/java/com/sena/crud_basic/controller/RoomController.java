package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.RoomDto;
import com.sena.crud_basic.model.Room;
import com.sena.crud_basic.service.RoomService;

@RestController
@RequestMapping({"/api/v1/Room"})
public class RoomController extends BaseModelController<Room,RoomDto> {

    public RoomController(RoomService roomService){
        super(roomService);
    }
}
