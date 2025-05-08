package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Proyecto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iProyectoRepository extends iGenericRepository<Proyecto, UUID> {

    List<Proyecto> findByCliente_IdCliente(UUID idCliente);

    @Query("SELECT p FROM Proyecto p WHERE p.lider.idEmpleado = :idLider")
    List<Proyecto> findByLider(@Param("idLider") Long idLider);

    @Query(nativeQuery = true, value = "SELECT * FROM Proyecto WHERE precio_final = :precio")
    List<Proyecto> findByPrecioFinal(@Param("precio") String precio);
}
