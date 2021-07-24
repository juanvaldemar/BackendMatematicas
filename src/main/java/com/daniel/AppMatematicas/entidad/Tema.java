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
public class Tema implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_tema") //=> ID
    private Long id_tema;

    @Column(name = "titulo_tema") //=> ID
    private String titulo_tema;

    @Column(name = "preguntas_tema") //=> ID
    private String preguntas_tema;

    @Column(name = "posicion") //=> ID
    private String posicion;

}
