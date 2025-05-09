package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Categoria;
import org.example.pnclaboratorio02.Repositories.CategoriaRepository;
import org.example.pnclaboratorio02.Services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> buscarPorId(UUID id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria actualizar(UUID id, Categoria categoriaActualizado) {
        if (!categoriaRepository.existsById(id)) {
            throw new EntityNotFoundException("Categoria no encontrada");
        }
        categoriaActualizado.setIdCategoria(id);
        return categoriaRepository.save(categoriaActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        categoriaRepository.deleteById(id);
    }
}
