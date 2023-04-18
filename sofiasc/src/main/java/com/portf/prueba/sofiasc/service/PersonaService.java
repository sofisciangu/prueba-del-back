package com.portf.prueba.sofiasc.service;

import com.portf.prueba.sofiasc.model.Persona;
import com.portf.prueba.sofiasc.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository personaRepository;

    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona buscarPesona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona editarPersona(Persona persona) {
        return personaRepository.save(persona);
    }
}
