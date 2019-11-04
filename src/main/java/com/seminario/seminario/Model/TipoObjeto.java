package com.seminario.seminario.Model;



import javax.persistence.*;

@Entity
@Table(name = "tipo_objeto")
public class TipoObjeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_objeto_id")
    private Long id;

    @Column(name = "nombre")
    private String 	nombre;

    @Column(name = "descripcion")
    private String  descripcion;

    public TipoObjeto() {
    }

    public TipoObjeto(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
