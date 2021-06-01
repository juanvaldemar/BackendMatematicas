package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TemaRepository extends JpaRepository<Tema,String> {

}
