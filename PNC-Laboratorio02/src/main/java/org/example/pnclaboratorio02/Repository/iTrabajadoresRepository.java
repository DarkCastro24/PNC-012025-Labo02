package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Trabajadores;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iTrabajadoresRepository extends iGenericRepository<Trabajadores, UUID> {

    List<Trabajadores> findByProyecto_IdProyecto(UUID idProyecto);

    @Query("SELECT t FROM Trabajadores t WHERE t.empleado.idEmpleado = :idEmpleado")
    List<Trabajadores> findByEmpleado(@Param("idEmpleado") Long idEmpleado);

    @Query(nativeQuery = true, value = "SELECT * FROM Trabajadores WHERE id_trabajador = :id")
    Trabajadores findByIdTrabajador(@Param("id") UUID id);
}
