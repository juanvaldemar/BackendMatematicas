package com.daniel.AppMatematicas.service;

import com.daniel.AppMatematicas.entidad.SubTema;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubTemaService {

    List<SubTema> findAll();

    SubTema findById(String id);

    SubTema save(SubTema objecto);


}
