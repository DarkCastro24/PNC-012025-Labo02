package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Asistencia;

public interface IAsistenciaService {
    Asistencia guardar(Asistencia asistencia);
    Optional<Asistencia> buscarPorId(UUID id);
    List<Asistencia> buscarTodos();
    Asistencia actualizar(UUID id, Asistencia asistenciaActualizado);
    void eliminar(UUID id);
}
