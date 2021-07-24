package com.daniel.AppMatematicas.entidad;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporte implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_reporte") //=> ID
    private int id_reporte;

    @Column(name = "nombre") //=> ID
    private String nombre;

    @Column(name = "fecha") //=> ID
    private Timestamp fecha;

    @Column(name = "nota") //=> ID
    private int nota;

    @Column(name = "motivacion") //=> ID
    private String motivacion;

    @Column(name = "satisfaccion") //=> ID
    private String satisfaccion;


    @Column(name = "cantidad") //=> ID
    private String cantidad;


}
