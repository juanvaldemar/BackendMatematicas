package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ReporteRepository extends JpaRepository<Reporte,String> {

}
