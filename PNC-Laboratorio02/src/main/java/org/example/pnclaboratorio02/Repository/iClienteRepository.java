package org.example.pnclaboratorio02.Repository;

import jakarta.transaction.Transactional;
import org.example.pnclaboratorio02.Domain.Entities.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iClienteRepository extends iGenericRepository<Cliente, UUID> {

    Cliente findByCorreo(String correo);

    @Query("SELECT c FROM Cliente c WHERE c.rubro.idRubro = :idRubro")
    List<Cliente> findByRubro(@Param("idRubro") UUID idRubro);

    @Query(nativeQuery = true, value = "SELECT * FROM Cliente WHERE nombre = :nombre")
    List<Cliente> findByNombreNative(@Param("nombre") String nombre);
}
