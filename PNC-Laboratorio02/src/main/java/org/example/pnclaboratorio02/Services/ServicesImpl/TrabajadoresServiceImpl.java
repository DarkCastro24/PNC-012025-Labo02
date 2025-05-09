package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Trabajadores;
import org.example.pnclaboratorio02.Repositories.TrabajadoresRepository;
import org.example.pnclaboratorio02.Services.ITrabajadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TrabajadoresServiceImpl implements ITrabajadoresService {

    @Autowired
    private TrabajadoresRepository trabajadoresRepository;

    @Override
    public Trabajadores guardar(Trabajadores trabajadores) {
        return trabajadoresRepository.save(trabajadores);
    }

    @Override
    public Optional<Trabajadores> buscarPorId(UUID id) {
        return trabajadoresRepository.findById(id);
    }

    @Override
    public List<Trabajadores> buscarTodos() {
        return trabajadoresRepository.findAll();
    }

    @Override
    public Trabajadores actualizar(UUID id, Trabajadores trabajadoresActualizado) {
        if (!trabajadoresRepository.existsById(id)) {
            throw new EntityNotFoundException("Trabajadores no encontrado");
        }
        trabajadoresActualizado.setIdTrabajador(id);
        return trabajadoresRepository.save(trabajadoresActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        trabajadoresRepository.deleteById(id);
    }
}
