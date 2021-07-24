package com.daniel.AppMatematicas.service;

import com.daniel.AppMatematicas.entidad.Niveles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NivelesService {

    List<Niveles> findAll();

    Niveles findById(String id);

    Niveles save(Niveles objecto);

}
