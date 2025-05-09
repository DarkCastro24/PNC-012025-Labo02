package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Rubro;

public interface IRubroService {
    Rubro guardar(Rubro rubro);
    Optional<Rubro> buscarPorId(UUID id);
    List<Rubro> buscarTodos();
    Rubro actualizar(UUID id, Rubro rubroActualizado);
    void eliminar(UUID id);
}
