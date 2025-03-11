package com.sena.crud_basic.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Clients")
@Getter
@Setter
public class client extends GenericModel {
    private String Name;
    private String Email;
    private String Phone;

    @OneToMany(mappedBy = "client")
    private List<Booking> Bookings;
}

