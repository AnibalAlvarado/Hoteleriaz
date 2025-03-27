package com.sena.crud_basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crud_basic.DTOs.PaymentDto;
import com.sena.crud_basic.model.Payment;
import com.sena.crud_basic.service.PaymentService;

@RestController
@RequestMapping({"/api/v1/Payment"})
public class PaymentController extends BaseModelController<Payment,PaymentDto> {

    public PaymentController(PaymentService paymentService){
        super(paymentService);
    }
}
