package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Transactional
public interface iEmpleadoRepository extends iGenericRepository<Empleado, Long> {

    List<Empleado> findByNombre(String nombre);

    @Query(nativeQuery = true, value = "SELECT * FROM Empleados WHERE nombre = :nombre")
    List<Empleado> findByNombreNativo(@Param("nombre") String nombre);

    @Query("SELECT e FROM Empleado e WHERE e.nombre = :nombre")
    List<Empleado> findByNombreJPQL(@Param("nombre") String nombre);
}
