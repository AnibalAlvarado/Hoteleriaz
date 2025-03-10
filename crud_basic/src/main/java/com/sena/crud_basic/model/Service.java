package com.sena.crud_basic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Services")
@Getter
@Setter
public class Service extends GenericModel {
    private String Name;
    private String Description;
    
    @ManyToOne
    @JoinColumn(name = "HotelId")
    private Hotel Hotel;
}