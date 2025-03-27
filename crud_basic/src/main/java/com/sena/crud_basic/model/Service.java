package com.sena.crud_basic.model;

import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Services")
@Getter
@Setter
public class Service {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private String Name;
    private Optional<String> Description = Optional.empty();

    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel HotelId;

    public Service() {
    }

    public Service(int id, String name, Optional<String> description, Hotel hotelId) {
        Id = id;
        Name = name;
        Description = description;
        HotelId = hotelId;
    }

}