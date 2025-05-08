package org.example.pnclaboratorio02.Repository;

import org.example.pnclaboratorio02.Domain.Entities.Asistencia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iAsistenciaRepository extends iGenericRepository<Asistencia, UUID> {

}
