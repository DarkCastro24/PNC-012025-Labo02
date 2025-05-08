package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Departamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iDepartamentoRepository extends iGenericRepository<Departamento, UUID> {

    Departamento findByNombre(String nombre);

    @Query("SELECT d FROM Departamento d WHERE d.nombre LIKE %:filtro%")
    List<Departamento> findByNombreContiene(@Param("filtro") String filtro);

    @Query(nativeQuery = true, value = "SELECT * FROM Departamento WHERE id_departamento = :id")
    Departamento findByIdDepartamentoNative(@Param("id") UUID id);
}
