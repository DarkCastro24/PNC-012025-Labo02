package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Rubro;
import org.example.pnclaboratorio02.Repositories.RubroRepository;
import org.example.pnclaboratorio02.Services.IRubroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RubroServiceImpl implements IRubroService {

    @Autowired
    private RubroRepository rubroRepository;

    @Override
    public Rubro guardar(Rubro rubro) {
        return rubroRepository.save(rubro);
    }

    @Override
    public Optional<Rubro> buscarPorId(UUID id) {
        return rubroRepository.findById(id);
    }

    @Override
    public List<Rubro> buscarTodos() {
        return rubroRepository.findAll();
    }

    @Override
    public Rubro actualizar(UUID id, Rubro rubroActualizado) {
        if (!rubroRepository.existsById(id)) {
            throw new EntityNotFoundException("Rubro no encontrado");
        }
        rubroActualizado.setIdRubro(id);
        return rubroRepository.save(rubroActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        rubroRepository.deleteById(id);
    }
}
