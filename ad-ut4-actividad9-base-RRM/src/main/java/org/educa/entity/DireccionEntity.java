package org.educa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Data
public class DireccionEntity {
    private Integer id;
    private ClienteEntity cliente;
    private String calle;
    private String ciudad;
    private String cp;
    private String pais;
    private String usuCre;
    private Timestamp fecCre;
    private String usuMod;
    private Timestamp fecMod;
}
