package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Evaluacion;

public interface IEvaluacionService {
    Evaluacion guardar(Evaluacion evaluacion);
    Optional<Evaluacion> buscarPorId(UUID id);
    List<Evaluacion> buscarTodos();
    Evaluacion actualizar(UUID id, Evaluacion evaluacionActualizado);
    void eliminar(UUID id);
}
