package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.BookingDetail;

public interface IBookingDetailRepository extends JpaRepository<BookingDetail, Long> {

}
