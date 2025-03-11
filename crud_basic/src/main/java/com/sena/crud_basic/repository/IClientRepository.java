package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.client;

public interface IClientRepository extends JpaRepository<client, Long>{

}
