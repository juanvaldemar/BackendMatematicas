package com.valdemar.AppMatematicas.entidad;


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
public class Reporte implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_reporte") //=> ID
    private int id_reporte;

    @Column(name = "nombre") //=> ID
    private String nombre;

    @Column(name = "fecha") //=> ID
    private Date fecha = new Date();

    @Column(name = "nota") //=> ID
    private String nota;


}
