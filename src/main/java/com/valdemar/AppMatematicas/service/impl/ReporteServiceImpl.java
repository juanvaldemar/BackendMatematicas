package com.valdemar.AppMatematicas.service.impl;

import com.valdemar.AppMatematicas.entidad.Reporte;
import com.valdemar.AppMatematicas.repository.ReporteRepository;
import com.valdemar.AppMatematicas.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    @Override
    public List<Reporte> findAll() {
        return reporteRepository.listado();
    }

    @Override
    public Reporte findById(String id) {
        return null;
    }

    @Override
    public Reporte save(Reporte objecto) {
        return reporteRepository.save(objecto);
    }
}
