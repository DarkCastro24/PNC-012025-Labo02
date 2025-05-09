package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Puesto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iPuestoRepository extends iGenericRepository<Puesto, UUID> {

    Puesto findByNombre(String nombre);

    @Query("SELECT p FROM Puesto p WHERE p.idPuesto = :idPuesto")
    Puesto findByIdPuesto(@Param("idPuesto") UUID idPuesto);

    @Query(nativeQuery = true, value = "SELECT * FROM Puesto WHERE nombre LIKE %:filtro%")
    List<Puesto> findByNombreContiene(@Param("filtro") String filtro);
}
