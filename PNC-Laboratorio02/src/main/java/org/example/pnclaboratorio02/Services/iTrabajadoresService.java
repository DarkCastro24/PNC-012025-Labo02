package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Trabajadores;

public interface ITrabajadoresService {
    Trabajadores guardar(Trabajadores trabajadores);
    Optional<Trabajadores> buscarPorId(UUID id);
    List<Trabajadores> buscarTodos();
    Trabajadores actualizar(UUID id, Trabajadores trabajadoresActualizado);
    void eliminar(UUID id);
}
