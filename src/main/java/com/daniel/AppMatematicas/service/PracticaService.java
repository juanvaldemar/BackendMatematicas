package com.daniel.AppMatematicas.service;

import com.daniel.AppMatematicas.entidad.Practica;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PracticaService {

    List<Practica> findAll();

    Practica findById(String id);

    Practica save(Practica objecto);


}
