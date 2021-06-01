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
public class Practica implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_practica") //=> ID
    private Long id_practica;

    @Column(name = "id_grado") //=> ID
    private String id_grado;


    @Column(name = "fecha") //=> ID
    private Date fecha = new Date();



}
