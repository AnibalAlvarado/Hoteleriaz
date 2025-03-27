package com.sena.crud_basic.DTOs;


import com.sena.crud_basic.model.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDto extends GenericDto {
    public BookingDto() {
    }
    public BookingDto(String startDate, String endDate, client clientId) {
        StartDate = startDate;
        EndDate = endDate;
        ClientId = clientId;
    }
    private String StartDate;
    private String EndDate;
    private client ClientId;
}
