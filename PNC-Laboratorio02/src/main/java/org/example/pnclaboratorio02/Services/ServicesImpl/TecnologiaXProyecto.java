package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.TecnologiaXProyecto;
import org.example.pnclaboratorio02.Repositories.TecnologiaXProyectoRepository;
import org.example.pnclaboratorio02.Services.ITecnologiaXProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TecnologiaXProyectoServiceImpl implements ITecnologiaXProyectoService {

    @Autowired
    private TecnologiaXProyectoRepository tecnologiaXProyectoRepository;

    @Override
    public TecnologiaXProyecto guardar(TecnologiaXProyecto tecnologiaXProyecto) {
        return tecnologiaXProyectoRepository.save(tecnologiaXProyecto);
    }

    @Override
    public Optional<TecnologiaXProyecto> buscarPorId(UUID id) {
        return tecnologiaXProyectoRepository.findById(id);
    }

    @Override
    public List<TecnologiaXProyecto> buscarTodos() {
        return tecnologiaXProyectoRepository.findAll();
    }

    @Override
    public TecnologiaXProyecto actualizar(UUID id, TecnologiaXProyecto tecnologiaXProyectoActualizado) {
        if (!tecnologiaXProyectoRepository.existsById(id)) {
            throw new EntityNotFoundException("TecnologiaXProyecto no encontrado");
        }
        tecnologiaXProyectoActualizado.setIdTecnologiaProyecto(id);
        return tecnologiaXProyectoRepository.save(tecnologiaXProyectoActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        tecnologiaXProyectoRepository.deleteById(id);
    }
}
