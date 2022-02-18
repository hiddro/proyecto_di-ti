package com.proyecto.di.ti.diti.controllers;

import com.proyecto.di.ti.diti.models.dto.AlumnoReqDto;
import com.proyecto.di.ti.diti.models.entities.AlumnoRequerimiento;
import com.proyecto.di.ti.diti.services.interfaces.IAlumnoRequerimientoServ;
import com.proyecto.di.ti.global.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = Constant.PATH_API_ALUMNOS + "services")
public class AlumnoRequerimientoCont {

    @Autowired
    private IAlumnoRequerimientoServ iAlumnoRequerimientoServ;

    @PostMapping(value = "/registro", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<AlumnoRequerimiento> procesaBorradorContrato(@RequestBody AlumnoReqDto alumnoReqDto){

        Map<String, Object> response = new HashMap<>();

        try {
            AlumnoReqDto alumno = iAlumnoRequerimientoServ.saveALumno(alumnoReqDto);
            response.put("mensaje", "Registro Exitoso!");
            response.put("alumno", alumno);
        }catch (Exception ex){
            response.put("error", ex);
            return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity(response, HttpStatus.OK);
    }

}
