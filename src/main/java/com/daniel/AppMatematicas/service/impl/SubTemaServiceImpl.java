package com.daniel.AppMatematicas.service.impl;

import com.daniel.AppMatematicas.entidad.SubTema;
import com.daniel.AppMatematicas.repository.SubTemaRepository;
import com.daniel.AppMatematicas.service.SubTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubTemaServiceImpl implements SubTemaService {

    @Autowired
    private SubTemaRepository subTemaRepository;

    @Override
    public List<SubTema> findAll() {
        return subTemaRepository.findAll();
    }

    @Override
    public SubTema findById(String id) {
        return null;
    }

    @Override
    public SubTema save(SubTema objecto) {
        return subTemaRepository.save(objecto);
    }
}
