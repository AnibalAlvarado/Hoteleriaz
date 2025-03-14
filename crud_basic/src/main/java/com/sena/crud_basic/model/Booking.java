package com.sena.crud_basic.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Bookings")
@Getter
@Setter
public class Booking extends GenericModel {
    private String StartDate;
    private String EndDate;
    
    @ManyToOne
    @JoinColumn(name = "ClientId")
    private client Clients;

    @OneToMany(mappedBy = "Booking")
    private List<BookingDetail> BookingDetails;
}
