package com.daniel.AppMatematicas.service;

import com.daniel.AppMatematicas.entidad.Reporte;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReporteService {

    List<Reporte> findAll();

    Reporte findById(String id);

    Reporte save(Reporte objecto);


}
