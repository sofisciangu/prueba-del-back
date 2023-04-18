package com.portf.prueba.sofiasc.repository;

import com.portf.prueba.sofiasc.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    public Optional<Persona> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
