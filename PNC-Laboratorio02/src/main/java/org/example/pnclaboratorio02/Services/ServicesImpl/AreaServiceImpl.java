package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Area;
import org.example.pnclaboratorio02.Repositories.AreaRepository;
import org.example.pnclaboratorio02.Services.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AreaServiceImpl implements IAreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public Area guardar(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public Optional<Area> buscarPorId(UUID id) {
        return areaRepository.findById(id);
    }

    @Override
    public List<Area> buscarTodos() {
        return areaRepository.findAll();
    }

    @Override
    public Area actualizar(UUID id, Area areaActualizado) {
        if (!areaRepository.existsById(id)) {
            throw new EntityNotFoundException("Area no encontrada");
        }
        areaActualizado.setIdArea(id);
        return areaRepository.save(areaActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        areaRepository.deleteById(id);
    }
}
