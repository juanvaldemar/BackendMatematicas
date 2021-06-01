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
public class SubTema implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_sub_tema") //=> ID
    private Long id_sub_tema;

    @Column(name = "id_nivel") //=> ID
    private String id_nivel;

    @Column(name = "titulo_tema") //=> ID
    private String titulo_tema;

}
