package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Tecnologia;
import org.example.pnclaboratorio02.Repositories.TecnologiaRepository;
import org.example.pnclaboratorio02.Services.ITecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TecnologiaServiceImpl implements ITecnologiaService {

    @Autowired
    private TecnologiaRepository tecnologiaRepository;

    @Override
    public Tecnologia guardar(Tecnologia tecnologia) {
        return tecnologiaRepository.save(tecnologia);
    }

    @Override
    public Optional<Tecnologia> buscarPorId(UUID id) {
        return tecnologiaRepository.findById(id);
    }

    @Override
    public List<Tecnologia> buscarTodos() {
        return tecnologiaRepository.findAll();
    }

    @Override
    public Tecnologia actualizar(UUID id, Tecnologia tecnologiaActualizado) {
        if (!tecnologiaRepository.existsById(id)) {
            throw new EntityNotFoundException("Tecnologia no encontrada");
        }
        tecnologiaActualizado.setIdTecnologia(id);
        return tecnologiaRepository.save(tecnologiaActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        tecnologiaRepository.deleteById(id);
    }
}
