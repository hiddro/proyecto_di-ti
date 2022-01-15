package com.proyecto.di.ti.diti.models.entities;

import javax.persistence.*;
import java.io.Serializable;

public class RegistroServicioRequerimiento extends BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_REGISTRO_SERVICIO")
    @SequenceGenerator(name = "SEQ_ID_REGISTRO_SERVICIO", sequenceName = "SEQ_ID_REGISTRO_SERVICIO", allocationSize = 1)
    @Id
    @Column(name = "ID_REGISTRO_SERVICIO") Integer idRegistroServicio;

}
