package com.sena.crud_basic.DTOs;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto extends GenericDto {
    public ClientDto() {
    }
    public ClientDto(String name, String email, String phone) {
        Name = name;
        Email = email;
        Phone = phone;
    }
    private String Name ;
    private String Email ;
    private String Phone ;
}
