package com.daniel.AppMatematicas.service.impl;

import com.daniel.AppMatematicas.entidad.Niveles;
import com.daniel.AppMatematicas.repository.NivelesRepository;
import com.daniel.AppMatematicas.service.NivelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelesServiceImpl implements NivelesService {

    @Autowired
    private NivelesRepository gradoRepository;

    @Override
    public List<Niveles> findAll() {
        return gradoRepository.findAll();
    }

    @Override
    public Niveles findById(String id) {
        return null;
    }

    @Override
    public Niveles save(Niveles objecto) {
        return gradoRepository.save(objecto);
    }
}
