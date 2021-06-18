package com.valdemar.AppMatematicas.repository;

import com.valdemar.AppMatematicas.entidad.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ReporteRepository extends JpaRepository<Reporte,String> {

}
