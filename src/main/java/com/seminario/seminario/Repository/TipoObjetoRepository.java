package com.seminario.seminario.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.seminario.seminario.Model.TipoObjeto;


public interface TipoObjetoRepository extends JpaRepository<TipoObjeto, Long> {
    }