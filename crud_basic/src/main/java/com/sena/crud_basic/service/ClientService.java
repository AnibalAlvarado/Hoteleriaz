package com.sena.crud_basic.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTOs.ClientDto;
import com.sena.crud_basic.model.client;
import com.sena.crud_basic.repository.IClientRepository;


@Service
public class ClientService extends GenericService<client, ClientDto> {

    @Autowired
    private final IClientRepository clientRepository;

    public ClientService(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
        this.repository = clientRepository; 
    }

    @Override
    protected client convertToModel(ClientDto dto) {
        client clientEntity = new client();
        dto.getId().ifPresent(clientEntity::setId);
        dto.getName().ifPresent(clientEntity::setName);
        dto.getEmail().ifPresent(clientEntity::setEmail);
        dto.getPhone().ifPresent(clientEntity::setPhone);
        return clientEntity;
    }

    @Override
    protected ClientDto convertToDTO(client model) {
        ClientDto dto = new ClientDto();
        dto.setId(Optional.ofNullable(model.getId()));
        dto.setName(Optional.ofNullable(model.getName()));
        dto.setEmail(Optional.ofNullable(model.getEmail()));
        dto.setPhone(Optional.ofNullable(model.getPhone()));
        return dto;
    }
    
}