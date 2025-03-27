package com.sena.crud_basic.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.sena.crud_basic.DTOs.RoomDto;
import com.sena.crud_basic.model.Room;
import com.sena.crud_basic.repository.IRoomRepository;

public class RoomService extends GenericService<Room,RoomDto> {
     @Autowired
     private final IRoomRepository roomRepository;


    public RoomService(IRoomRepository roomRepository) {
        this.roomRepository = roomRepository;
        this.repository = roomRepository;
    }

    @Override
    protected Room convertToModel(RoomDto dto) {
       
        return new Room(
            0,
            dto.getType(),
            dto.getPrice(),
            dto.getHotelId()
            );      
            
    }
    
    @Override
    protected RoomDto convertToDTO(Room model) {

        return new RoomDto(
            model.getType(),
            model.getPrice(),
            model.getHotelId()
        );
    }
}
