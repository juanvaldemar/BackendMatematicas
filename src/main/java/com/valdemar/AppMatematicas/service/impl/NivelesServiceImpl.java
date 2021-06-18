package com.valdemar.AppMatematicas.service.impl;

import com.valdemar.AppMatematicas.entidad.Niveles;
import com.valdemar.AppMatematicas.repository.NivelesRepository;
import com.valdemar.AppMatematicas.service.NivelesService;
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
