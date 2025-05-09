package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Capacitacion;
import org.example.pnclaboratorio02.Repositories.CapacitacionRepository;
import org.example.pnclaboratorio02.Services.ICapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CapacitacionServiceImpl implements ICapacitacionService {

    @Autowired
    private CapacitacionRepository capacitacionRepository;

    @Override
    public Capacitacion guardar(Capacitacion capacitacion) {
        return capacitacionRepository.save(capacitacion);
    }

    @Override
    public Optional<Capacitacion> buscarPorId(UUID id) {
        return capacitacionRepository.findById(id);
    }

    @Override
    public List<Capacitacion> buscarTodos() {
        return capacitacionRepository.findAll();
    }

    @Override
    public Capacitacion actualizar(UUID id, Capacitacion capacitacionActualizado) {
        if (!capacitacionRepository.existsById(id)) {
            throw new EntityNotFoundException("Capacitacion no encontrada");
        }
        capacitacionActualizado.setIdCapacitacion(id);
        return capacitacionRepository.save(capacitacionActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        capacitacionRepository.deleteById(id);
    }
}
