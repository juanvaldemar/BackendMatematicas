package com.valdemar.AppMatematicas.service;

import com.valdemar.AppMatematicas.entidad.Tema;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TemaService {

    List<Tema> findAll();

    Tema findById(String id);

    Tema save(Tema objecto);

}
