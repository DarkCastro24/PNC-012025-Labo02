package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Categoria;

public interface ICategoriaService {
    Categoria guardar(Categoria categoria);
    Optional<Categoria> buscarPorId(UUID id);
    List<Categoria> buscarTodos();
    Categoria actualizar(UUID id, Categoria categoriaActualizado);
    void eliminar(UUID id);
}
