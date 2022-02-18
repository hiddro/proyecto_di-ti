package com.proyecto.di.ti.diti.services;

import com.proyecto.di.ti.diti.models.dto.AlumnoReqDto;
import com.proyecto.di.ti.diti.models.entities.AlumnoRequerimiento;
import com.proyecto.di.ti.diti.repositores.IAlumnoRequerimientoRepo;
import com.proyecto.di.ti.diti.services.interfaces.IAlumnoRequerimientoServ;
import com.proyecto.di.ti.global.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class AlumnoRequerimientoServ implements IAlumnoRequerimientoServ {

    @Autowired
    private IAlumnoRequerimientoRepo iAlumnoRequerimientoRepo;

    @Override
    public AlumnoReqDto saveALumno(AlumnoReqDto alumnoReqDto) {

        if(!Optional.ofNullable(alumnoReqDto).isPresent()) throw  new RuntimeException(Constant.MESSAGE_ALUMNO_NULL);

        AlumnoRequerimiento alumnoRequerimiento = AlumnoRequerimiento.builder()
                .apellido(alumnoReqDto.getApellido())
                .celular(alumnoReqDto.getCelular())
                .correo(alumnoReqDto.getCorreo())
                .direccion(alumnoReqDto.getDireccion())
                .dni(alumnoReqDto.getDni())
                .edad(alumnoReqDto.getEdad())
                .genero(alumnoReqDto.getGenero())
                .nombre(alumnoReqDto.getNombre())
                .build();

//        alumnoRequerimiento.setEstado("I");
//        alumnoRequerimiento.setFechaCreacion(new Date());
        iAlumnoRequerimientoRepo.save(alumnoRequerimiento);

        alumnoReqDto.setIdAlumnoRequerimiento(iAlumnoRequerimientoRepo.save(alumnoRequerimiento).getIdAlumnoRequerimiento());

        return alumnoReqDto;


    }
}
