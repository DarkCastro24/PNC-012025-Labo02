package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Asistencia;
import org.example.pnclaboratorio02.Repositories.AsistenciaRepository;
import org.example.pnclaboratorio02.Services.IAsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AsistenciaServiceImpl implements IAsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @Override
    public Asistencia guardar(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Optional<Asistencia> buscarPorId(UUID id) {
        return asistenciaRepository.findById(id);
    }

    @Override
    public List<Asistencia> buscarTodos() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Asistencia actualizar(UUID id, Asistencia asistenciaActualizado) {
        if (!asistenciaRepository.existsById(id)) {
            throw new EntityNotFoundException("Asistencia no encontrada");
        }
        asistenciaActualizado.setIdAsistencia(id);
        return asistenciaRepository.save(asistenciaActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        asistenciaRepository.deleteById(id);
    }
}
