package com.seminario.seminario.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.seminario.seminario.Model.Personas;

public interface PersonasRepository extends JpaRepository <Personas, Long> {
}
