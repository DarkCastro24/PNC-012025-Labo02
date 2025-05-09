package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Comentario;

public interface IComentarioService {
    Comentario guardar(Comentario comentario);
    Optional<Comentario> buscarPorId(UUID id);
    List<Comentario> buscarTodos();
    Comentario actualizar(UUID id, Comentario comentarioActualizado);
    void eliminar(UUID id);
}
