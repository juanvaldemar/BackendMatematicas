package com.valdemar.AppMatematicas.service;

import com.valdemar.AppMatematicas.entidad.Grado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GradoService {

    List<Grado> findAll();

    Grado findById(String id);

    Grado save(Grado objecto);


}
