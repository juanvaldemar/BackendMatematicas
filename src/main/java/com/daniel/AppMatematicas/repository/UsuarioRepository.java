package com.daniel.AppMatematicas.repository;

import com.daniel.AppMatematicas.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioRepository extends JpaRepository<Usuario,String> {

}
