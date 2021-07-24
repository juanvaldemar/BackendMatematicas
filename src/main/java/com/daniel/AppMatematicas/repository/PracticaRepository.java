package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.Practica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PracticaRepository extends JpaRepository<Practica,String> {

}
