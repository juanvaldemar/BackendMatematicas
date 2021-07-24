package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.SubTema;
import com.daniel.AppMatematicas.service.SubTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SubTemaController {

    @Autowired
    private SubTemaService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/subtema", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public SubTema saveSubTema(@RequestBody SubTema request) {

        SubTema response = new SubTema();


        try {
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/subtema", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<SubTema>  getSubTema() {

        List<SubTema> response = new ArrayList<>();

        try {
            response = service.findAll();
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }




}
