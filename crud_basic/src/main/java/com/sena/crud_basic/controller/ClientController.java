package com.sena.crud_basic.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.ClientDto;
import com.sena.crud_basic.model.client;
import com.sena.crud_basic.service.ClientService;

@RestController
@RequestMapping({"/api/v1/Client"})
public class ClientController  extends BaseModelController<client,ClientDto> {

    public ClientController(ClientService clientService){
        super(clientService);
    }
}
