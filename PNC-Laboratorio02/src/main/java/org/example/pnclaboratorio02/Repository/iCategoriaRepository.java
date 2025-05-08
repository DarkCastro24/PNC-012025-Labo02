package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iCategoriaRepository extends iGenericRepository<Categoria, UUID> {

    Categoria findByNombre(String nombre);

    @Query("SELECT c FROM Categoria c WHERE c.idCategoria = :idCategoria")
    Categoria findByIdCategoria(@Param("idCategoria") UUID idCategoria);

    @Query(nativeQuery = true, value = "SELECT * FROM Cateogira WHERE id_area = :idArea")
    List<Categoria> findByAreaNative(@Param("idArea") UUID idArea);
}
