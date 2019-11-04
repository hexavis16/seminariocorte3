package com.seminario.seminario.Model;



import javax.persistence.*;

@Entity
@Table(name = "personas")
public class Personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id;

    @Column(name = "celular")
    private String 	celular;

    @Column(name = "direccion")
    private String  direccion;

    @Column(name = "apellido")
    private String  apellido;

    @Column(name = "correo")
    private String  correo;

    @ManyToOne
    @JoinColumn(name = "fk_ciudad_id", referencedColumnName = "ciudad_id")
    private Ciudad ciudad;

    public Personas() {
    }

    public Personas(Long id, String celular, String direccion, String apellido, String correo, Ciudad ciudad) {
        this.id = id;
        this.celular = celular;
        this.direccion = direccion;
        this.apellido = apellido;
        this.correo = correo;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
