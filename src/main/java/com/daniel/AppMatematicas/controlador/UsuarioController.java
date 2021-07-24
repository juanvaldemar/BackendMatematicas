package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.Usuario;
import com.daniel.AppMatematicas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/usuario", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Usuario guardarUsuario(@RequestBody Usuario request) {

        Usuario response = new Usuario();


        try {
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/usuario", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Usuario>  getUsuario() {

        List<Usuario> response = new ArrayList<>();

        try {
            response = service.findAll();
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }




}
