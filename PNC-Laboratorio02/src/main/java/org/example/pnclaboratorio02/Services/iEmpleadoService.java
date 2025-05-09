package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import org.example.pnclaboratorio02.Domain.Entities.Empleado;

public interface IEmpleadoService {
    Empleado guardar(Empleado empleado);
    Optional<Empleado> buscarPorId(Long id);
    List<Empleado> buscarTodos();
    Empleado actualizar(Long id, Empleado empleadoActualizado);
    void eliminar(Long id);
}
