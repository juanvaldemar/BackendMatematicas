package com.valdemar.AppMatematicas.controlador;

import com.valdemar.AppMatematicas.entidad.Reporte;
import com.valdemar.AppMatematicas.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReporteController {

    @Autowired
    private ReporteService service;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/reporte", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Reporte guardarReporte(@RequestBody Reporte request) {

        Reporte response = new Reporte();


        try {

            // 2021-03-24 16:48:05.591
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            Date date = new Date();
            Timestamp actual = new Timestamp(date.getTime());

            request.setFecha(actual);
            response = service.save(request);
        } catch (Exception e) {
            System.out.println("Error guardarReporte Controller: "+ e);
        }

        return response;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/reporte", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Reporte>  getReporte() {

        List<Reporte> response = new ArrayList<>();

        try {
            response = service.findAll();

        } catch (Exception e) {
            System.out.println("Error guardarReporte Controller: "+ e);
        }

        return response;
    }




}
