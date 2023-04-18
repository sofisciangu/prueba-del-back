package com.portf.prueba.sofiasc.service;

import com.portf.prueba.sofiasc.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPesona (Long id);
    public Persona editarPersona (Persona per);
}
