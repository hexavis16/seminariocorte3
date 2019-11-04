package com.seminario.seminario.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.seminario.seminario.Model.Objeto;

public interface ObjetoRepository extends JpaRepository <Objeto, Long> {
}
