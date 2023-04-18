package com.portf.prueba.sofiasc.service;

import com.portf.prueba.sofiasc.model.Educacion;
import com.portf.prueba.sofiasc.model.Persona;
import com.portf.prueba.sofiasc.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {

    @Autowired
    EducacionRepository educacionRepository;

    public List<Educacion> verEducacion() {
        return educacionRepository.findAll();
    }

    public void crearEducacion(Educacion educacion) {
        educacionRepository.save(educacion);

    }

    public void borrarEducacion(int id) {
        educacionRepository.deleteById(id);

    }

    public Persona buscarEducacion(int id) {
        educacionRepository.findById(id);
        return null;
    }

    public Optional<Educacion> getByNombreE(String nombreE) {
        return educacionRepository.findByNombreE(nombreE);
    }

    public boolean existsById(int id) {
        return educacionRepository.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return educacionRepository.existsByNombreE(nombreE);
    }
}
