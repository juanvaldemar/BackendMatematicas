package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.Niveles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface NivelesRepository extends JpaRepository<Niveles,String> {

}
