package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.Room;

public interface IRoomRepository extends JpaRepository<Room, Long> {

}
