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
public class NivelEstudio implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_estudio") //=> ID
    private Long id_estudio;

    @Column(name = "nivel_estudio") //=> ID
    private String nivel_estudio;

    @Column(name = "anio") //=> ID
    private String anio;



}
