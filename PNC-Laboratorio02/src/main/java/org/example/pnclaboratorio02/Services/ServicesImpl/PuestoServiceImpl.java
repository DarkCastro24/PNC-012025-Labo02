package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Puesto;
import org.example.pnclaboratorio02.Repositories.PuestoRepository;
import org.example.pnclaboratorio02.Services.IPuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PuestoServiceImpl implements IPuestoService {

    @Autowired
    private PuestoRepository puestoRepository;

    @Override
    public Puesto guardar(Puesto puesto) {
        return puestoRepository.save(puesto);
    }

    @Override
    public Optional<Puesto> buscarPorId(UUID id) {
        return puestoRepository.findById(id);
    }

    @Override
    public List<Puesto> buscarTodos() {
        return puestoRepository.findAll();
    }

    @Override
    public Puesto actualizar(UUID id, Puesto puestoActualizado) {
        if (!puestoRepository.existsById(id)) {
            throw new EntityNotFoundException("Puesto no encontrado");
        }
        puestoActualizado.setIdPuesto(id);
        return puestoRepository.save(puestoActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        puestoRepository.deleteById(id);
    }
}
