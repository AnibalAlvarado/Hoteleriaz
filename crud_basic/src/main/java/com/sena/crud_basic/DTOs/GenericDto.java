package com.sena.crud_basic.DTOs;
import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericDto {
    private Optional<Long> Id = Optional.empty();
}
