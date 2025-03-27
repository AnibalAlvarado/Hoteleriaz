package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.EmployeeHotel;

public interface IEmployeeHotelRepository extends JpaRepository<EmployeeHotel, Integer> {

}
