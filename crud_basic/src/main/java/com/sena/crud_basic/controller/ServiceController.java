package com.sena.crud_basic.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.ServiceDto;
import com.sena.crud_basic.model.Service;
import com.sena.crud_basic.service.ServiceService;

@RestController
@RequestMapping({"/api/v1/Service"})
public class ServiceController extends BaseModelController<Service,ServiceDto> {

    public ServiceController(ServiceService serviceService){
        super(serviceService);
    }
}
