package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Area;

public interface IAreaService {
    Area guardar(Area area);
    Optional<Area> buscarPorId(UUID id);
    List<Area> buscarTodos();
    Area actualizar(UUID id, Area areaActualizado);
    void eliminar(UUID id);
}
