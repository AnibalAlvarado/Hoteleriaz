package com.sena.crud_basic.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Hotels")
@Getter
@Setter
public class Hotel extends GenericModel {
    private String Name;
    private String Address;
    
    @OneToMany(mappedBy = "Hotel")
    private List<Room> Rooms;
}

