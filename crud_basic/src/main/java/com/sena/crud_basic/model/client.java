package com.sena.crud_basic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Clients")
@Getter
@Setter
public class client {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    private String Name;
    private String Email;
    private String Phone;

    @OneToMany(mappedBy = "Client")
    private List<Booking> Bookings;

    public client() {
    }

    public client(int id, String name, String email, String phone) {
        Id = id;
        Name = name;
        Email = email;
        Phone = phone;
    }

}

