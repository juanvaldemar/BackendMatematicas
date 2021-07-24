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
public class Niveles implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_niveles") //=> ID
    private Long id_niveles;

    @Column(name = "tiempo_nivel") //=> ID
    private String tiempo_nivel;

    @Column(name = "puntaje_nivel") //=> ID
    private String puntaje_nivel;

}
