package org.example.cuenta_service_devsu.cuenta.infrastructure.db.repositoryImpl;

import org.example.cuenta_service_devsu.cuenta.domain.repository.MovimientoRepo;
import org.example.cuenta_service_devsu.cuenta.infrastructure.db.entity.MovimientoEnt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MovimientoEntRepository extends MovimientoRepo<MovimientoEnt, Integer> {

    @Override
    @Query(value = "SELECT * FROM movimiento m where m.fecha BETWEEN ?1 and ?2", nativeQuery = true)
    public List<MovimientoEnt> buscarPorRangoFechas(Date fecha1, Date fecha2);

}
