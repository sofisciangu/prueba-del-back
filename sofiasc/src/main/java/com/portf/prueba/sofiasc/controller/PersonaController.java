package com.portf.prueba.sofiasc.controller;

import com.portf.prueba.sofiasc.model.Persona;
import com.portf.prueba.sofiasc.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona persona) {
        personaService.crearPersona(persona);
    }

    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas() {
        return personaService.verPersonas();
    }
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
    }
    @PutMapping ("/editar/persona")
    public void editarPersona(@RequestBody Persona persona) {
        personaService.editarPersona(persona);
    }
}
