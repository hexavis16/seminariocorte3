package com.seminario.seminario.Model;

import javax.persistence.*;

@Entity
@Table(name = "ciudad")

public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ciudad_id")
    private Long id;

    @Column(name = "nombre")
    private String 	nombre;

    @ManyToOne
    @JoinColumn(name = "fk_pais_id", referencedColumnName = "pais_id")
    private Pais pais;

    public Ciudad() {
    }

    public Ciudad(Long id, String nombre, Pais pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
