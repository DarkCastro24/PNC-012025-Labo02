package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Comentario;
import org.example.pnclaboratorio02.Repositories.ComentarioRepository;
import org.example.pnclaboratorio02.Services.IComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ComentarioServiceImpl implements IComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public Comentario guardar(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public Optional<Comentario> buscarPorId(UUID id) {
        return comentarioRepository.findById(id);
    }

    @Override
    public List<Comentario> buscarTodos() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario actualizar(UUID id, Comentario comentarioActualizado) {
        if (!comentarioRepository.existsById(id)) {
            throw new EntityNotFoundException("Comentario no encontrado");
        }
        comentarioActualizado.setIdComentario(id);
        return comentarioRepository.save(comentarioActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        comentarioRepository.deleteById(id);
    }
}
