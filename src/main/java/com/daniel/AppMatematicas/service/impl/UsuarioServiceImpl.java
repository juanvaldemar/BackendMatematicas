package com.daniel.AppMatematicas.service.impl;

import com.daniel.AppMatematicas.entidad.Usuario;
import com.daniel.AppMatematicas.repository.UsuarioRepository;
import com.daniel.AppMatematicas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(String id) {
        return null;
    }

    @Override
    public Usuario save(Usuario objecto) {
        return usuarioRepository.save(objecto);
    }
}
