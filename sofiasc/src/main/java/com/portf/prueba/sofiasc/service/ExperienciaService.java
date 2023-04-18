package com.portf.prueba.sofiasc.service;

import com.portf.prueba.sofiasc.model.Experiencia;
import com.portf.prueba.sofiasc.model.Persona;
import com.portf.prueba.sofiasc.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    ExperienciaRepository experienciaRepository;

    public List<Experiencia> verExperiencias() {
        return experienciaRepository.findAll();
    }

    public void crearExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);

    }

    public void borrarExperiencia(int id) {
        experienciaRepository.deleteById(id);

    }

    public Persona buscarExperiencia(int id) {
        experienciaRepository.findById(id);
        return null;
    }

    public Optional<Experiencia> getByNombreE(String nombreE) {
        return experienciaRepository.findByNombreE(nombreE);
    }

    public boolean existsById(int id) {
        return experienciaRepository.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return experienciaRepository.existsByNombreE(nombreE);
    }

}
