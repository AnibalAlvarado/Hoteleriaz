package com.sena.crud_basic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Hotels")
@Getter
@Setter
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private String Name;
    private String Address;
    private String Category;

    @OneToMany(mappedBy = "Hotels")
    private List<Room> Rooms;
    @OneToMany(mappedBy = "Hotels")
    private List<Service> Services;

    public Hotel() {
    }

    public Hotel(int id, String name, String address, String category) {
        Id = id;
        Name = name;
        Address = address;
        Category = category;
    }
}

