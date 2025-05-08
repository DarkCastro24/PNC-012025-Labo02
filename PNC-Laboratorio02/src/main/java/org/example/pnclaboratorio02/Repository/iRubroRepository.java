package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Rubro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iRubroRepository extends iGenericRepository<Rubro, UUID> {

    List<Rubro> findByNombre(String nombre);

    @Query("SELECT r FROM Rubro r WHERE r.idRubro = :idRubro")
    Rubro findByIdRubro(@Param("idRubro") UUID idRubro);

    @Query(nativeQuery = true, value = "SELECT * FROM Rubro WHERE nombre LIKE %:filtro%")
    List<Rubro> findByNombreContiene(@Param("filtro") String filtro);
}
