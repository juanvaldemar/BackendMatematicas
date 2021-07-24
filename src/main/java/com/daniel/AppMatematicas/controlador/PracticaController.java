package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.Practica;
import com.daniel.AppMatematicas.service.PracticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PracticaController {

    @Autowired
    private PracticaService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/practica", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Practica guardarPractica(@RequestBody Practica request) {

        Practica response = new Practica();


        try {
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/practica", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Practica> getPractica() {

        List<Practica> response = new ArrayList<>();

        try {
            response = service.findAll();
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }


}
