package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Tecnologia;

public interface ITecnologiaService {
    Tecnologia guardar(Tecnologia tecnologia);
    Optional<Tecnologia> buscarPorId(UUID id);
    List<Tecnologia> buscarTodos();
    Tecnologia actualizar(UUID id, Tecnologia tecnologiaActualizado);
    void eliminar(UUID id);
}
