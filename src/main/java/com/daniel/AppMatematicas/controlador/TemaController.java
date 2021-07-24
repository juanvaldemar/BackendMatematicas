package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.Tema;
import com.daniel.AppMatematicas.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TemaController {

    @Autowired
    private TemaService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/tema", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Tema guardarTema(@RequestBody Tema request) {

        Tema response = new Tema();


        try {
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/tema", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Tema> getTema() {

        List<Tema> response = new ArrayList<>();

        try {
            response = service.findAll();
        } catch (Exception e) {
            System.out.println("Error getTema Controller: "+ e);
        }

        return response;
    }


}
