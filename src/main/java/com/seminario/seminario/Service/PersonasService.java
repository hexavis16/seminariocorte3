package com.seminario.seminario.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seminario.seminario.Model.Personas;
import com.seminario.seminario.Repository.PersonasRepository;

import java.util.Optional;
import java.util.List;

@Service
public class PersonasService {
    @Autowired
    private PersonasRepository personasRepository;


    public Personas savePersonas(Personas personas) {
        return personasRepository.save(personas);
    }

    public Personas editPersonas(Personas personas) {
        return personasRepository.save(personas);
    }


    public void deletePersonasById(Long id) {
        personasRepository.deleteById(id);
    }

    public List<Personas> getAllPersonas() {
        return personasRepository.findAll();
    }

    public Optional<Personas> getById(Long id) {
        return personasRepository.findById(id);
    }
}
