package com.valdemar.AppMatematicas.repository;

import com.valdemar.AppMatematicas.entidad.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface GradoRepository extends JpaRepository<Grado,String> {

}
