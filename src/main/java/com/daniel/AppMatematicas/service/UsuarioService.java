package com.daniel.AppMatematicas.service;

import com.daniel.AppMatematicas.entidad.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<Usuario> findAll();

    Usuario findById(String id);

    Usuario save(Usuario objecto);


}
