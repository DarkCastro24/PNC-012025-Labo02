package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Capacitacion;

public interface ICapacitacionService {
    Capacitacion guardar(Capacitacion capacitacion);
    Optional<Capacitacion> buscarPorId(UUID id);
    List<Capacitacion> buscarTodos();
    Capacitacion actualizar(UUID id, Capacitacion capacitacionActualizado);
    void eliminar(UUID id);
}
