package com.sena.crud_basic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@MappedSuperclass
@Getter
@Setter
public abstract class GenericModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
}
