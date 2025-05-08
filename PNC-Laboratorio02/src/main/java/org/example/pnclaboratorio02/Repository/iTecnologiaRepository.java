package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Tecnologia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iTecnologiaRepository extends iGenericRepository<Tecnologia, UUID> {

    List<Tecnologia> findByNombre(String nombre);

    @Query("SELECT t FROM Tecnologia t WHERE t.version = :version")
    List<Tecnologia> findByVersion(@Param("version") String version);

    @Query(nativeQuery = true, value = "SELECT * FROM Tecnologia WHERE id_tecnologia = :id")
    Tecnologia findByIdTecnologia(@Param("id") UUID id);
}
