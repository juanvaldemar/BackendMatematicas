package com.daniel.AppMatematicas.service.impl;

import com.daniel.AppMatematicas.entidad.Tema;
import com.daniel.AppMatematicas.repository.TemaRepository;
import com.daniel.AppMatematicas.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaServiceImpl implements TemaService {

    @Autowired
    private TemaRepository temaRepository;

    @Override
    public List<Tema> findAll() {
        return temaRepository.findAll();
    }

    @Override
    public Tema findById(String id) {
        return null;
    }

    @Override
    public Tema save(Tema objecto) {
        return temaRepository.save(objecto);
    }
}
