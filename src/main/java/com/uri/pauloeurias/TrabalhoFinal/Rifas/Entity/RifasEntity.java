package com.uri.pauloeurias.TrabalhoFinal.Rifas.Entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;

import java.io.Serializable;

@Entity
@Table(name = "Rifas")
public class RifasEntity implements Serializable {

    @Id
    private Long id;

    @Column(name = "Valor")
    private Double Valor;

    @Column(name = "Numero")
    private Integer Numero;

    protected RifasEntity() {}
    public RifasEntity(Double valor, Integer numero) {
        this.Valor = valor;
        this.Numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }
}
