package com.sena.crud_basic.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.sena.crud_basic.DTOs.PaymentDto;
import com.sena.crud_basic.model.Payment;
import com.sena.crud_basic.repository.IPaymentRepository;

public class PaymentService extends GenericService<Payment,PaymentDto> {
     @Autowired
     private final IPaymentRepository paymentRepository;


    public PaymentService(IPaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
        this.repository = paymentRepository;
    }

    @Override
    protected Payment convertToModel(PaymentDto dto) {
       
        return new Payment(
            0,
            dto.getTypePayment(),
            dto.getAmount(),
            dto.getInvoiceId()
            );      
            
    }
    
    @Override
    protected PaymentDto convertToDTO(Payment model) {

        return new PaymentDto(
            model.getInvoiceId(),
            model.getTypePayment(),
            model.getAmount()
        );
    }
}
