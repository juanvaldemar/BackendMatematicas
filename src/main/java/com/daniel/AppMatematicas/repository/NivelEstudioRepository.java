package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.NivelEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface NivelEstudioRepository extends JpaRepository<NivelEstudio,String> {

}
