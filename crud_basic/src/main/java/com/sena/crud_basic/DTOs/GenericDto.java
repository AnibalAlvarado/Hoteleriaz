package com.sena.crud_basic.DTOs;
import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericDto {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    @Column(
        name = "Id"
    )
    private Optional<Integer> Id = Optional.empty();

    public GenericDto() {
    }

    public GenericDto(Optional<Integer> id) {
        Id = id;
    }
}
