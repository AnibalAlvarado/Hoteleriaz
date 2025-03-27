package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.Hotel;

public interface IHotelRepository extends JpaRepository<Hotel, Integer> {

}
