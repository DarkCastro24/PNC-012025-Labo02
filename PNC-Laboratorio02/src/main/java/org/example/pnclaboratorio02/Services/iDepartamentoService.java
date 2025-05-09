package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Departamento;

public interface IDepartamentoService {
    Departamento guardar(Departamento departamento);
    Optional<Departamento> buscarPorId(UUID id);
    List<Departamento> buscarTodos();
    Departamento actualizar(UUID id, Departamento departamentoActualizado);
    void eliminar(UUID id);
}
