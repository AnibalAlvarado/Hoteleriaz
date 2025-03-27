package com.sena.crud_basic.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.sena.crud_basic.DTOs.ServiceDto;
import com.sena.crud_basic.model.Service;
import com.sena.crud_basic.repository.IServiceRepository;

public class ServiceService extends GenericService<Service,ServiceDto> {
     
    @Autowired
    private final IServiceRepository serviceRepository;


    public ServiceService(IServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
        this.repository = serviceRepository;
    }

    @Override
    protected Service convertToModel(ServiceDto dto) {
       
        return new Service(
            0,
            dto.getName(),
            dto.getDescription(),
            dto.getHotelId()
            );      
            
    }
    
    @Override
    protected ServiceDto convertToDTO(Service model) {

        return new ServiceDto(
            model.getName(),
            model.getDescription(),
            model.getHotelId()
        );
    }
}
