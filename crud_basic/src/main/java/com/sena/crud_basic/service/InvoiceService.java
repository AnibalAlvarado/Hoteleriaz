package com.sena.crud_basic.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.crud_basic.DTOs.InvoiceDto;
import com.sena.crud_basic.model.Invoice;
import com.sena.crud_basic.repository.IInvoiceRepository;

@Service
public class InvoiceService extends GenericService<Invoice,InvoiceDto> {

    @Autowired
    private final IInvoiceRepository invoiceRepository;
    
    public InvoiceService(IInvoiceRepository invoiceRepository){
        this.invoiceRepository = invoiceRepository;
        this.repository = invoiceRepository; 
    }

     @Override
    protected Invoice convertToModel(InvoiceDto dto) {

        return new Invoice(
            0,
            dto.getDate(),
            dto.getAmount(),
            dto.getBookingId()
            );  
    }

    @Override
    protected InvoiceDto convertToDTO(Invoice model) {
        // InvoiceDto dto = new InvoiceDto();
        // dto.setId(Optional.ofNullable(model.getId()));
        // return dto;
        return new InvoiceDto(
            model.getDate(),
            model.getAmount(),
            model.getBookingId()
        );
    }
}
