package com.sena.crud_basic.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;

    private String StartDate;
    private String EndDate;

    @ManyToOne
    @JoinColumn(name = "ClientId")
    private client ClientsId;

    @OneToMany(mappedBy = "Booking")
    private List<BookingDetail> BookingDetails;

    public Booking() {
    }

    public Booking(int id, String startDate, String endDate, client clientsId) {
        Id = id;
        StartDate = startDate;
        EndDate = endDate;
        ClientsId = clientsId;
    }
}
