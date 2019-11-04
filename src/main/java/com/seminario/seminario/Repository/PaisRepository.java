package com.seminario.seminario.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.seminario.seminario.Model.Pais;

public interface PaisRepository extends JpaRepository <Pais, Long> {
}
