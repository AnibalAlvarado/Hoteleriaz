package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.InvoiceDto;
import com.sena.crud_basic.model.Invoice;
import com.sena.crud_basic.service.InvoiceService;

@RestController
@RequestMapping({"/api/v1/Invoice"})
public class InvoiceController extends BaseModelController<Invoice,InvoiceDto> {

    public InvoiceController(InvoiceService invoiceService){
        super(invoiceService);
    }
}
