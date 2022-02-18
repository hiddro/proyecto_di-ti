package com.proyecto.di.ti.diti.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "REGISTRO_SERVICIO_REQUERIMIENTO")
public class RegistroServicioRequerimiento extends BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_REGISTRO_SERVICIO") Integer idRegistroServicio;

    @Column(name = "ID_ALUMNO_REQUERIMIENTO") private Integer idAlumnoRequerimiento;
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn(name = "ID_ALUMNO_REQUERIMIENTO", referencedColumnName = "ID_ALUMNO_REQUERIMIENTO", insertable = false, updatable = false)
    private AlumnoRequerimiento alumnoRequerimiento;

    @Column(name = "ID_SERVICIO_REQUERIMIENTO") private Integer idServicioRequerimiento;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SERVICIO_REQUERIMIENTO", referencedColumnName = "ID_SERVICIO_REQUERIMIENTO", insertable = false, updatable = false)
    private ServicioRequerimiento servicioRequerimiento;

}
