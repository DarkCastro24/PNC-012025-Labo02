package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.TecnologiaXProyecto;

public interface ITecnologiaXProyectoService {
    TecnologiaXProyecto guardar(TecnologiaXProyecto tecnologiaXProyecto);
    Optional<TecnologiaXProyecto> buscarPorId(UUID id);
    List<TecnologiaXProyecto> buscarTodos();
    TecnologiaXProyecto actualizar(UUID id, TecnologiaXProyecto tecnologiaXProyectoActualizado);
    void eliminar(UUID id);
}
