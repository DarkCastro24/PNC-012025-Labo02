package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Proyecto;
import org.example.pnclaboratorio02.Repositories.ProyectoRepository;
import org.example.pnclaboratorio02.Services.IProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProyectoServiceImpl implements IProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public Proyecto guardar(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public Optional<Proyecto> buscarPorId(UUID id) {
        return proyectoRepository.findById(id);
    }

    @Override
    public List<Proyecto> buscarTodos() {
        return proyectoRepository.findAll();
    }

    @Override
    public Proyecto actualizar(UUID id, Proyecto proyectoActualizado) {
        if (!proyectoRepository.existsById(id)) {
            throw new EntityNotFoundException("Proyecto no encontrado");
        }
        proyectoActualizado.setIdProyecto(id);
        return proyectoRepository.save(proyectoActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        proyectoRepository.deleteById(id);
    }
}
