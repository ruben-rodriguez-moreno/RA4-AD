package org.educa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "direccion")
@NoArgsConstructor
public class DireccionEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;

    @Column(name = "calle")
    private String calle;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "cp")
    private String cp;

    @Column(name = "pais")
    private String pais;

    @Column(name = "usu_cre")
    private String usuCre;

    @Column(name = "fec_cre")
    private Timestamp fecCre;

    @Column(name = "usu_mod")
    private String usuMod;

    @Column(name = "fec_mod")
    private Timestamp fecMod;
}
