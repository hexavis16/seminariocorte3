package com.seminario.seminario.Model;



import javax.persistence.*;

@Entity
@Table(name = "objeto")
public class Objeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "objeto_id")
    private Long id;

    @Column(name = "tipo")
    private String 	tipo;

    @Column(name = "foto_objeto")
    private String  foto;

    @Column(name = "lugar")
    private String  lugar;

    @Column(name = "descripcion")
    private String  descripcion;

    @ManyToOne
    @JoinColumn(name = "fk_ciudad_id", referencedColumnName = "ciudad_id")
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "fk_tipo_objeto_id", referencedColumnName = "tipo_objeto_id")
    private TipoObjeto tipoObjeto;

    @ManyToOne
    @JoinColumn(name = "fk_id_persona", referencedColumnName = "id_persona")
    private Personas personas;

    public Objeto() {
    }

    public Objeto(Long id, String tipo, String foto, String lugar, String descripcion, Ciudad ciudad, TipoObjeto tipoObjeto, Personas personas) {
        this.id = id;
        this.tipo = tipo;
        this.foto = foto;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
        this.tipoObjeto = tipoObjeto;
        this.personas = personas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public TipoObjeto getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(TipoObjeto tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
}
