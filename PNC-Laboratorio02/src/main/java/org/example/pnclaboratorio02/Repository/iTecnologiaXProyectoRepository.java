package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.TecnologiaXProyecto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iTecnologiaXProyectoRepository extends iGenericRepository<TecnologiaXProyecto, UUID> {

    List<TecnologiaXProyecto> findByProyecto_IdProyecto(UUID idProyecto);

    @Query("SELECT txp FROM TecnologiaXProyecto txp WHERE txp.tecnologia.idTecnologia = :idTecnologia")
    List<TecnologiaXProyecto> findByTecnologia(@Param("idTecnologia") UUID idTecnologia);

    @Query(nativeQuery = true, value = "SELECT * FROM `Tecnologia-Proyecto` WHERE id_tecnologia_proyecto = :id")
    TecnologiaXProyecto findByIdTecnologiaProyecto(@Param("id") UUID id);
}
