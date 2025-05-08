package org.example.pnclaboratorio02.Repository;

import org.example.pnclaboratorio02.Domain.Entities.Evaluacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Transactional
public interface iEvaluacionRepository extends iGenericRepository<Evaluacion, UUID> {

}
