package com.uri.pauloeurias.TrabalhoFinal.Rifas.Entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Compradas")
public class CompradasEntity implements Serializable {
    @Id
    private Long id;

    @Column(name = "NomePessoa")
    private String NomePessoa;

    @ManyToOne
    @JoinColumn(name = "Id_rifa")
    private RifasEntity rifasEntity;
}
