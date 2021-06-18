package com.valdemar.AppMatematicas.service;

import com.valdemar.AppMatematicas.entidad.NivelEstudio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NivelEstudioService {

    List<NivelEstudio> findAll();

    NivelEstudio findById(String id);

    NivelEstudio save(NivelEstudio objecto);


}
