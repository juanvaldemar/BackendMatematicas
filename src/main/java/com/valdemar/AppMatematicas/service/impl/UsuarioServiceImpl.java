package com.valdemar.AppMatematicas.service.impl;

import com.valdemar.AppMatematicas.entidad.Usuario;
import com.valdemar.AppMatematicas.repository.UsuarioRepository;
import com.valdemar.AppMatematicas.service.UsuarioService;
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
