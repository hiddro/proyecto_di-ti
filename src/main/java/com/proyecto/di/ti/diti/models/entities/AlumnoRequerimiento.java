package com.proyecto.di.ti.diti.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ALUMNO_REQUERIMIENTO")
public class AlumnoRequerimiento extends BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_ALUMNO_REQUERIMIENTO")
    @SequenceGenerator(name = "SEQ_ID_ALUMNO_REQUERIMIENTO", sequenceName = "SEQ_ID_ALUMNO_REQUERIMIENTO", allocationSize = 1)
    @Id
    @Column(name = "ID_ALUMNO_REQUERIMIENTO") Integer idAlumnoRequerimiento;

    @Column(name = "APELLIDO") private String apellido;
    @Column(name = "CELULAR") private String celular;
    @Column(name = "CORREO") private String correo;
    @Column(name = "DIRECCION") private String direccion;
    @Column(name = "DNI") private String dni;
    @Column(name = "EDAD") private Integer edad;
    @Column(name = "GENERO") private String genero;
    @Column(name = "NOMBRE") private Integer nombre;

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", locale = "es_PE", timezone = "America/Lima")
    @Column(name = "FECHA_NACIMIENTO") private Date fechaNacimiento;


}
