package com.valdemar.AppMatematicas.repository;

import com.valdemar.AppMatematicas.entidad.NivelEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface NivelEstudioRepository extends JpaRepository<NivelEstudio,String> {

}
