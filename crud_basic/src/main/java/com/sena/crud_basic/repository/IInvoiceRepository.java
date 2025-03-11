package com.sena.crud_basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.crud_basic.model.Invoice;

public interface IInvoiceRepository extends JpaRepository<Invoice, Long>{

}
