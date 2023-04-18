package com.portf.prueba.sofiasc.controller;

import com.portf.prueba.sofiasc.model.Educacion;

import com.portf.prueba.sofiasc.service.EducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {

    @Autowired
    EducacionService educacionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list() {
        List<Educacion> verEducacion = educacionService.verEducacion();
        return new ResponseEntity(verEducacion, HttpStatus.OK);
    }

    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return educacionService.verEducacion();
    }

    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion educacion) {
        educacionService.crearEducacion(educacion);
    }

    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable int id) {
        educacionService.borrarEducacion(id);
    }

}
