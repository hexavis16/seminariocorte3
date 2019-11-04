package com.seminario.seminario.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seminario.seminario.Model.Ciudad;
import com.seminario.seminario.Repository.CiudadRepository;

import java.util.List;
import java.util.Optional;
@Service

public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public Ciudad saveCiudad(Ciudad objeto) {
        return ciudadRepository.save(objeto);
    }

    public Ciudad editCiudad(Ciudad objeto) { return ciudadRepository.save(objeto); }

    public void deleteCiudadById(Long id) {
        ciudadRepository.deleteById(id);
    }

    public List<Ciudad> getAllCiudad() {
        return ciudadRepository.findAll();
    }

    public Optional<Ciudad> getById(Long id) {
        return ciudadRepository.findById(id);
    }
}
