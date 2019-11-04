package com.seminario.seminario.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.seminario.seminario.Model.Ciudad;


public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
    }