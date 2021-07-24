package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.Niveles;
import com.daniel.AppMatematicas.service.NivelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NivelesController {

    @Autowired
    private NivelesService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/nivel", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Niveles guardarNivel(@RequestBody Niveles request) {

        Niveles response = new Niveles();


        try {
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/nivel", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Niveles> getNivel() {

        List<Niveles> response = new ArrayList<>();

        try {
            response = service.findAll();
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }


}
