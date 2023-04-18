package com.portf.prueba.sofiasc.controller;

import com.portf.prueba.sofiasc.model.Educacion;
import com.portf.prueba.sofiasc.model.HyS;
import com.portf.prueba.sofiasc.service.HySService;
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
@RequestMapping("/hys")
public class HySController {

    @Autowired
    HySService hysService;

    @GetMapping("/lista")
    public ResponseEntity<List<HyS>> list() {
        List<HyS> verHyS = hysService.verHyS();
        return new ResponseEntity(verHyS, HttpStatus.OK);
    }

    @GetMapping("/ver/yhs")
    @ResponseBody
    public List<HyS> verHyS() {
        return hysService.verHyS();
    }

    @PostMapping("/new/hys")
    public void agregarHyS(@RequestBody HyS hys) {
        hysService.crearHyS(hys);
    }

    @DeleteMapping("/delete/{id}")
    public void borrarHyS(@PathVariable int id) {
        hysService.borrarHyS(id);
    }

}
