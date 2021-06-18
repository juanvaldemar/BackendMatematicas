package com.valdemar.AppMatematicas.service.impl;

import com.valdemar.AppMatematicas.entidad.Grado;
import com.valdemar.AppMatematicas.repository.GradoRepository;
import com.valdemar.AppMatematicas.service.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradoServiceImpl implements GradoService {

    @Autowired
    private GradoRepository gradoRepository;

    @Override
    public List<Grado> findAll() {
        return gradoRepository.findAll();
    }

    @Override
    public Grado findById(String id) {
        return null;
    }

    @Override
    public Grado save(Grado objecto) {
        return gradoRepository.save(objecto);
    }
}
