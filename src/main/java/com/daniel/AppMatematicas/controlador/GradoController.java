package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.Grado;
import com.daniel.AppMatematicas.service.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GradoController {

    @Autowired
    private GradoService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/grado", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Grado guardarGrado(@RequestBody Grado request) {

        Grado response = new Grado();


        try {
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/grado", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Grado>  getGrado() {

        List<Grado> response = new ArrayList<>();

        try {
            response = service.findAll();
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }




}
