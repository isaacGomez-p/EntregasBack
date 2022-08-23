package com.model;

import javax.persistence.*;

@Entity
@Table(name = "causales")
public class CausalesEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="causal_id")
    private String causalId;

    @Column(name="nombre_causal")
    private String nombreCausal;

    @Column(name="codigo" , length = 20)
    private String codigo;

    public String getCausalId() {
        return causalId;
    }

    public void setCausalId(String causalId) {
        this.causalId = causalId;
    }

    public String getNombreCausal() {
        return nombreCausal;
    }

    public void setNombreCausal(String nombreCausal) {
        this.nombreCausal = nombreCausal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
