package com.sena.crud_basic.service;

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
      
        return new client(
            0,
            dto.getName(),
            dto.getEmail(),
            dto.getPhone()
            );  
    }

    @Override
    protected ClientDto convertToDTO(client model) {
        
          return new ClientDto(
            model.getName(),
            model.getEmail(),
            model.getPhone()
        );
    }
    
}