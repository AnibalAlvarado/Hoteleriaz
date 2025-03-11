package com.sena.crud_basic.repository;

import java.security.Provider.Service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceRepository extends JpaRepository<Service, Long> {

}
