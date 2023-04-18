package com.portf.prueba.sofiasc.controller;

import com.portf.prueba.sofiasc.model.Experiencia;
import com.portf.prueba.sofiasc.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencialaboral")
public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaService;

    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list() {
        List<Experiencia> verExperiencias = experienciaService.verExperiencias();
        return new ResponseEntity(verExperiencias, HttpStatus.OK);
    }

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return experienciaService.verExperiencias();
    }

    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.crearExperiencia(experiencia);
    }

    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable int id) {
        experienciaService.borrarExperiencia(id);
    }

}
