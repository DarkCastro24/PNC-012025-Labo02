package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Evaluacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iEvaluacionRepository extends iGenericRepository<Evaluacion, UUID> {

    List<Evaluacion> findByEmpleado_IdEmpleado(Long idEmpleado);

    @Query("SELECT e FROM Evaluacion e WHERE e.puntaje >= :minimo")
    List<Evaluacion> findByPuntajeMayorIgual(@Param("minimo") int minimo);

    @Query(nativeQuery = true, value = "SELECT * FROM Evaluacion WHERE id_empleado = :idEmpleado")
    List<Evaluacion> findByEmpleadoNativo(@Param("idEmpleado") Long idEmpleado);
}
