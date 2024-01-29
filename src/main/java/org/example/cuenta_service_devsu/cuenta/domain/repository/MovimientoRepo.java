package org.example.cuenta_service_devsu.cuenta.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface MovimientoRepo<T, ID> extends JpaRepository<T, ID> {


}
