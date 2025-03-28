package com.sena.crud_basic.controller;

import com.sena.crud_basic.service.GenericService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class BaseModelController<T, D> {

    protected final GenericService<T, D> service;
    
    public BaseModelController(GenericService<T, D> service) {
        this.service = service;
    }

    // Crear o actualizar un registro
    @PostMapping
    public ResponseEntity<T> save(@RequestBody D dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @PutMapping
    public ResponseEntity<T> update(@PathVariable int id,@RequestBody D dto) {
        return ResponseEntity.ok(service.update(id,dto));
    }

    // Obtener todos los registros
    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable Integer id) {
        Optional<T> entity = service.findById(id);
        return entity.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
