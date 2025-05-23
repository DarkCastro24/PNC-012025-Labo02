package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Area;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iAreaRepository extends iGenericRepository<Area, UUID> {

    Area findByNombre(String nombre);

    @Query("SELECT a FROM Area a WHERE a.idArea = :idArea")
    Area findByIdArea(@Param("idArea") UUID idArea);

    @Query(nativeQuery = true, value = "SELECT * FROM Area WHERE precio = :precio")
    List<Area> findByPrecioNative(@Param("precio") String precio);
}



