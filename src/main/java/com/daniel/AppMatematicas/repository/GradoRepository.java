package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface GradoRepository extends JpaRepository<Grado,String> {



}
