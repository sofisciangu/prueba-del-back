package com.portf.prueba.sofiasc.repository;

import com.portf.prueba.sofiasc.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {

    public Optional<Experiencia> findByNombreE(String nombreE);

    public boolean existsByNombreE(String nombreE);
}
