package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Departamento;
import org.example.pnclaboratorio02.Repositories.DepartamentoRepository;
import org.example.pnclaboratorio02.Services.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public Departamento guardar(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Optional<Departamento> buscarPorId(UUID id) {
        return departamentoRepository.findById(id);
    }

    @Override
    public List<Departamento> buscarTodos() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento actualizar(UUID id, Departamento departamentoActualizado) {
        if (!departamentoRepository.existsById(id)) {
            throw new EntityNotFoundException("Departamento no encontrado");
        }
        departamentoActualizado.setIdDepartamento(id);
        return departamentoRepository.save(departamentoActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        departamentoRepository.deleteById(id);
    }
}

