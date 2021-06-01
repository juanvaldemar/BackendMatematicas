package com.daniel.AppMatematicas.entidad;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_usuario") //=> ID
    private int id_usuario;

    @Column(name = "nombre_usuario") //=> ID
    private String nombre_usuario;

    @Column(name = "sexo_usuario") //=> ID
    private String sexo_usuario;

    @Column(name = "password") //=> ID
    private String password;

    @Column(name = "email") //=> ID
    private String email;

    @Column(name = "fecha_usuario") //=> ID
    private Date fecha_usuario = new Date();




}
