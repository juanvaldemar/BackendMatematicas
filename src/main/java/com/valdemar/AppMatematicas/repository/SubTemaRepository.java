package com.valdemar.AppMatematicas.repository;

import com.valdemar.AppMatematicas.entidad.SubTema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface SubTemaRepository extends JpaRepository<SubTema,String> {

}
