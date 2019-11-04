package com.seminario.seminario.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seminario.seminario.Model.Pais;
import com.seminario.seminario.Repository.PaisRepository;

import java.util.List;
import java.util.Optional;

@Service

public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public Pais savePais(Pais objeto) {
        return paisRepository.save(objeto);
    }

    public Pais editPais(Pais objeto) { return paisRepository.save(objeto); }

    public void deletePaisById(Long id) {
        paisRepository.deleteById(id);
    }

    public List<Pais> getAllPais() {
        return paisRepository.findAll();
    }

    public Optional<Pais> getById(Long id) {
        return paisRepository.findById(id);
    }

}
