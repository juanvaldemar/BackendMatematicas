package com.daniel.AppMatematicas.service.impl;

import com.daniel.AppMatematicas.entidad.Practica;
import com.daniel.AppMatematicas.repository.PracticaRepository;
import com.daniel.AppMatematicas.service.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticaServiceImpl implements PracticaService {

    @Autowired
    private PracticaRepository practicaRepository;

    @Override
    public List<Practica> findAll() {
        return practicaRepository.findAll();
    }

    @Override
    public Practica findById(String id) {
        return null;
    }

    @Override
    public Practica save(Practica objecto) {
        return practicaRepository.save(objecto);
    }
}
