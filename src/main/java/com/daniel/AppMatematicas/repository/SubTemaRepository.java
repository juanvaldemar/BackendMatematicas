package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.SubTema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface SubTemaRepository extends JpaRepository<SubTema,String> {

}
