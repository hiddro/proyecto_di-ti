package com.proyecto.di.ti.diti.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import static javax.persistence.TemporalType.TIMESTAMP;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "ALUMNO_REQUERIMIENTO")
public class AlumnoRequerimiento implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ALUMNO_REQUERIMIENTO") Integer idAlumnoRequerimiento;

    @Column(name = "APELLIDO") private String apellido;
    @Column(name = "CELULAR") private String celular;
    @Column(name = "CORREO") private String correo;
    @Column(name = "DIRECCION") private String direccion;
    @Column(name = "DNI") private String dni;
    @Column(name = "EDAD") private Integer edad;
    @Column(name = "GENERO") private String genero;
    @Column(name = "NOMBRE") private String nombre;

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", locale = "es_PE", timezone = "America/Lima")
    @Column(name = "FECHA_NACIMIENTO") private Date fechaNacimiento;

    @OneToMany(mappedBy = "alumnoRequerimiento", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<RegistroServicioRequerimiento> registroServicioRequerimientos;

}
