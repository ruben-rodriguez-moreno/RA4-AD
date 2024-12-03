package org.educa.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class ClienteEntity {
    private Integer id;
    private String email;
    private String pass;
    private String dni;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String usuCre;
    private Timestamp fecCre;
    private String usuMod;
    private Timestamp fecMod;
    private List<DireccionEntity> direcciones;

}
