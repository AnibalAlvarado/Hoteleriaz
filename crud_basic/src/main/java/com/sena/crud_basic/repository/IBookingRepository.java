package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Integer>{

}
