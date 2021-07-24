package com.daniel.AppMatematicas.service.impl;

import com.daniel.AppMatematicas.entidad.NivelEstudio;
import com.daniel.AppMatematicas.repository.NivelEstudioRepository;
import com.daniel.AppMatematicas.service.NivelEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelEstudioServiceImpl implements NivelEstudioService {

    @Autowired
    private NivelEstudioRepository gradoRepository;

    @Override
    public List<NivelEstudio> findAll() {
        return gradoRepository.findAll();
    }

    @Override
    public NivelEstudio findById(String id) {
        return null;
    }

    @Override
    public NivelEstudio save(NivelEstudio objecto) {
        return gradoRepository.save(objecto);
    }
}
