package com.valdemar.AppMatematicas.repository;

import com.valdemar.AppMatematicas.entidad.Practica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PracticaRepository extends JpaRepository<Practica,String> {

}
