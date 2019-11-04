package com.seminario.seminario.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seminario.seminario.Model.Objeto;
import com.seminario.seminario.Repository.ObjetoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ObjetoService {

    @Autowired
    private ObjetoRepository objetoRepository;

    public Objeto saveObjeto(Objeto objeto) {
        return objetoRepository.save(objeto);
    }

    public Objeto editObjeto(Objeto objeto) {
        return objetoRepository.save(objeto);
    }


    public void deleteObjetoById(Long id) {
        objetoRepository.deleteById(id);
    }

    public List<Objeto> getAllObjeto() {
        return objetoRepository.findAll();
    }

    public Optional<Objeto> getById(Long id) {
        return objetoRepository.findById(id);
    }
}
