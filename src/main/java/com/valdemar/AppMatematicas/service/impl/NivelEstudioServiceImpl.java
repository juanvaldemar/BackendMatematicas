package com.valdemar.AppMatematicas.service.impl;

import com.valdemar.AppMatematicas.entidad.NivelEstudio;
import com.valdemar.AppMatematicas.repository.NivelEstudioRepository;
import com.valdemar.AppMatematicas.service.NivelEstudioService;
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
