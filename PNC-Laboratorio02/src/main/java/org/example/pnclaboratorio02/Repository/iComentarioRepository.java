package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Comentario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iComentarioRepository extends iGenericRepository<Comentario, UUID> {

    List<Comentario> findByEvaluacion_IdEvaluacion(UUID idEvaluacion);

    @Query("SELECT c FROM Comentario c WHERE c.idComentario = :idComentario")
    Comentario findByIdComentario(@Param("idComentario") UUID idComentario);

    @Query(nativeQuery = true, value = "SELECT * FROM Comentario WHERE descripcion LIKE %:palabraClave%")
    List<Comentario> findByDescripcionNative(@Param("palabraClave") String palabraClave);
}
