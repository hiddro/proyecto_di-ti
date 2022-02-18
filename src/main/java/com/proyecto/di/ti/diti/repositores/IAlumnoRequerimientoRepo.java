package com.proyecto.di.ti.diti.repositores;

import com.proyecto.di.ti.diti.models.entities.AlumnoRequerimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRequerimientoRepo extends JpaRepository<AlumnoRequerimiento, Integer> {

}
