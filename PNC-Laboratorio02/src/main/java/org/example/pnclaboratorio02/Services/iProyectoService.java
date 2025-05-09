package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Proyecto;

public interface IProyectoService {
    Proyecto guardar(Proyecto proyecto);
    Optional<Proyecto> buscarPorId(UUID id);
    List<Proyecto> buscarTodos();
    Proyecto actualizar(UUID id, Proyecto proyectoActualizado);
    void eliminar(UUID id);
}
