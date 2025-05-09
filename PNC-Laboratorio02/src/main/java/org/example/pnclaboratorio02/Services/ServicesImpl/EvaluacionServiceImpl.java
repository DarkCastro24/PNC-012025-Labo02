package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Evaluacion;
import org.example.pnclaboratorio02.Repositories.EvaluacionRepository;
import org.example.pnclaboratorio02.Services.IEvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EvaluacionServiceImpl implements IEvaluacionService {

    @Autowired
    private EvaluacionRepository evaluacionRepository;

    @Override
    public Evaluacion guardar(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    @Override
    public Optional<Evaluacion> buscarPorId(UUID id) {
        return evaluacionRepository.findById(id);
    }

    @Override
    public List<Evaluacion> buscarTodos() {
        return evaluacionRepository.findAll();
    }

    @Override
    public Evaluacion actualizar(UUID id, Evaluacion evaluacionActualizado) {
        if (!evaluacionRepository.existsById(id)) {
            throw new EntityNotFoundException("Evaluacion no encontrada");
        }
        evaluacionActualizado.setIdEvaluacion(id);
        return evaluacionRepository.save(evaluacionActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        evaluacionRepository.deleteById(id);
    }
}
