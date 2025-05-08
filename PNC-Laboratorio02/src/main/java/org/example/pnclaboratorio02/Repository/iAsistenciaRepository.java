package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Asistencia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iAsistenciaRepository extends iGenericRepository<Asistencia, UUID> {

    List<Asistencia> findByEmpleado_IdEmpleado(Long idEmpleado);

    @Query("SELECT a FROM Asistencia a WHERE a.idAsistencia = :idAsistencia")
    Asistencia findByIdAsistencia(@Param("idAsistencia") UUID idAsistencia);

    @Query(nativeQuery = true, value = "SELECT * FROM Asistencia WHERE id_capacitacion = :idCapacitacion")
    List<Asistencia> findByCapacitacionNative(@Param("idCapacitacion") UUID idCapacitacion);
}
