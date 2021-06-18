package com.valdemar.AppMatematicas.service.impl;

import com.valdemar.AppMatematicas.entidad.SubTema;
import com.valdemar.AppMatematicas.repository.SubTemaRepository;
import com.valdemar.AppMatematicas.service.SubTemaService;
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
