package com.seminario.seminario.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seminario.seminario.Model.TipoObjeto;
import com.seminario.seminario.Repository.TipoObjetoRepository;

import java.util.List;
import java.util.Optional;

@Service

public class TipoObjetoService {
    @Autowired
    private TipoObjetoRepository tipoObjetoRepository;

    public TipoObjeto saveTipoObjeto(TipoObjeto objeto) {
        return tipoObjetoRepository.save(objeto);
    }

    public TipoObjeto editTipoObjeto(TipoObjeto objeto) { return tipoObjetoRepository.save(objeto); }

    public void deleteTipoObjetoById(Long id) {
        tipoObjetoRepository.deleteById(id);
    }

    public List<TipoObjeto> getAllTipoObjeto() {
        return tipoObjetoRepository.findAll();
    }

    public Optional<TipoObjeto> getById(Long id) {
        return tipoObjetoRepository.findById(id);
    }
}
