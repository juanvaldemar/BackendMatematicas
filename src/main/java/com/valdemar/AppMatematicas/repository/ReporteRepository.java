package com.valdemar.AppMatematicas.repository;

import com.valdemar.AppMatematicas.entidad.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReporteRepository extends JpaRepository<Reporte,String> {



    @Query(value = "SELECT " +
            "* " +
            "FROM " +
            "reporte " +
            "ORDER BY " +
            "nota desc, " +
            "fecha desc;", nativeQuery = true)
    List<Reporte> listado();


}
