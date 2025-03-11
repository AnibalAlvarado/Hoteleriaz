package com.sena.crud_basic.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.stereotype.Service;

import com.sena.crud_basic.DTOs.ClientDto;
import com.sena.crud_basic.model.client;
import com.sena.crud_basic.repository.IClientRepository;


@Service
public class ClientService extends GenericService<client, ClientDto> {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    protected client convertToModel(ClientDto dto) {
        client clientEntity = new client();
        // Si esto extiende de GenericModel, probablemente el ID ya esté manejado en la clase padre
        
        // Establecer los valores desde el DTO
        clientEntity.setName(dto.getName().orElse(""));
        clientEntity.setEmail(dto.getEmail().orElse(""));
        clientEntity.setPhone(dto.getPhone().orElse(""));
        
        return clientEntity;
    }

    @Override
    protected ClientDto convertToDTO(client model) {
        ClientDto clientDto = new ClientDto();
        
        // Establecer los valores desde la entidad
        clientDto.setName(Optional.ofNullable(model.getName()));
        clientDto.setEmail(Optional.ofNullable(model.getEmail()));
        clientDto.setPhone(Optional.ofNullable(model.getPhone()));
        
        return clientDto;
    }
    
}