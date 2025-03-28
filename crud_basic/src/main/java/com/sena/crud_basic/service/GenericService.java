package com.sena.crud_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

public abstract class GenericService<T, D> {

    @Autowired
    protected JpaRepository<T, Integer> repository;

    // Método abstracto para conversión de DTO a Modelo
    protected abstract T convertToModel(D dto);

    // Método abstracto para conversión de Modelo a DTO
    protected abstract D convertToDTO(T model);

    // Guardar 
    public T save(D dto) {
        T entity = convertToModel(dto);
        return repository.save(entity);
    }

     // Actualizar un registro existente
    public T update(Integer id, D dto) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Entidad con ID " + id + " no encontrada.");
        }
        T entity = convertToModel(dto);
        return repository.save(entity);
    }

    // Obtener todos los registros
    public List<T> findAll() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<T> findById(Integer id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Entidad con ID " + id + " no encontrada.");
        }
        return repository.findById(id);
    }

    // Eliminar por ID
    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Entidad con ID " + id + " no encontrada.");
        }
        repository.deleteById(id);
    }
}