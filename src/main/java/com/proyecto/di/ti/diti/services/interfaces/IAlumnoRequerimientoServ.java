package com.proyecto.di.ti.diti.services.interfaces;

import com.proyecto.di.ti.diti.models.dto.AlumnoReqDto;
import com.proyecto.di.ti.diti.models.entities.AlumnoRequerimiento;

public interface IAlumnoRequerimientoServ {

    AlumnoReqDto saveALumno(AlumnoReqDto alumnoRequerimiento);
}