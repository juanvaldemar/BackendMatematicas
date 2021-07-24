package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.NivelEstudio;
import com.daniel.AppMatematicas.service.NivelEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NivelEstudioController {

    @Autowired
    private NivelEstudioService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/nivel_estudio", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public NivelEstudio guardarNivelEstudio(@RequestBody NivelEstudio request) {

        NivelEstudio response = new NivelEstudio();


        try {
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/nivel_estudio", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<NivelEstudio>  getNivelEstudio() {

        List<NivelEstudio> response = new ArrayList<>();

        try {
            response = service.findAll();
        } catch (Exception e) {
            System.out.println("Error guardarUsuario Controller: "+ e);
        }

        return response;
    }




}
