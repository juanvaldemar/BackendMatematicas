package com.valdemar.AppMatematicas.repository;

import com.valdemar.AppMatematicas.entidad.Niveles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface NivelesRepository extends JpaRepository<Niveles,String> {

}
