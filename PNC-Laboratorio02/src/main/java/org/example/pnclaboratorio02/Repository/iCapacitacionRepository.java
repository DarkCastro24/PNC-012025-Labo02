package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Capacitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iCapacitacionRepository extends iGenericRepository<Capacitacion, UUID> {

    List<Capacitacion> findByTema(String tema);

    @Query("SELECT c FROM Capacitacion c WHERE c.duracion = :duracion")
    List<Capacitacion> findByDuracion(@Param("duracion") String duracion);

    @Query(nativeQuery = true, value = "SELECT * FROM Capacitacion WHERE fecha = :fecha")
    List<Capacitacion> findByFechaNative(@Param("fecha") String fecha);
}
