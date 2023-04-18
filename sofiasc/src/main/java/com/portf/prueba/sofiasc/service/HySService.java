package com.portf.prueba.sofiasc.service;

import com.portf.prueba.sofiasc.model.HyS;
import com.portf.prueba.sofiasc.model.Persona;
import com.portf.prueba.sofiasc.repository.HySRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HySService {

    @Autowired
    HySRepository hysRepository;

    public List<HyS> verHyS() {
        return hysRepository.findAll();
    }

    public void crearHyS(HyS hys) {
        hysRepository.save(hys);
    }

    public void borrarHyS(int id) {
        hysRepository.deleteById(id);
    }

    public Persona buscarHyS(int id) {
        hysRepository.findById(id);
        return null;
    }

    public boolean existsById(int id) {
        return hysRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return hysRepository.existsByNombre(nombre);
    }

}
