package com.daniel.AppMatematicas.service;

import com.daniel.AppMatematicas.entidad.NivelEstudio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NivelEstudioService {

    List<NivelEstudio> findAll();

    NivelEstudio findById(String id);

    NivelEstudio save(NivelEstudio objecto);


}
