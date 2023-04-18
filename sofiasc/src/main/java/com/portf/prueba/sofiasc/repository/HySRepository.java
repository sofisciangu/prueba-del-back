package com.portf.prueba.sofiasc.repository;

import com.portf.prueba.sofiasc.model.HyS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HySRepository extends JpaRepository<HyS, Integer> {

    Optional<HyS> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
