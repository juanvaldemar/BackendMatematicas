package com.valdemar.AppMatematicas.service.impl;

import com.valdemar.AppMatematicas.entidad.Practica;
import com.valdemar.AppMatematicas.repository.PracticaRepository;
import com.valdemar.AppMatematicas.service.PracticaService;
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
