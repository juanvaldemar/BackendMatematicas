package com.daniel.AppMatematicas.controlador;

import com.daniel.AppMatematicas.entidad.Reporte;
import com.daniel.AppMatematicas.entidad.ReporteRequest;
import com.daniel.AppMatematicas.service.ReporteService;
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
    public Reporte guardarReporte(@RequestBody ReporteRequest request) {

        Reporte response = new Reporte();
        ReporteRequest reporteRequest = new ReporteRequest();


        try {

            // 2021-03-24 16:48:05.591
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            Date date = new Date();
            Timestamp actual = new Timestamp(date.getTime());

            response.setFecha(actual);

            response.setCantidad(request.getCantidad());
            response.setFecha(actual);
            response.setMotivacion(request.getMotivacion());
            response.setSatisfaccion(request.getSatisfaccion());
            response.setNombre(request.getNombre());
            response.setNota(Integer.parseInt(request.getNota()));

            response = service.save(response);

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
