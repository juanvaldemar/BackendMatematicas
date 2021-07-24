package com.daniel.AppMatematicas.entidad;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grado implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_grado") //=> ID
    private int id_grado;

    @Column(name = "id_estudio") //=> ID
    private String id_estudio;

    @Column(name = "grado") //=> ID
    private String grado;

    @Column(name = "seccion") //=> ID
    private String seccion;



}
