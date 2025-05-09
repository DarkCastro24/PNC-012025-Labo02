package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Puesto;

public interface IPuestoService {
    Puesto guardar(Puesto puesto);
    Optional<Puesto> buscarPorId(UUID id);
    List<Puesto> buscarTodos();
    Puesto actualizar(UUID id, Puesto puestoActualizado);
    void eliminar(UUID id);
}
