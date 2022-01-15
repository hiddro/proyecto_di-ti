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
@Table(name = "SERVICIO_REQUERIMIENTO")
public class ServicioRequerimiento extends BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_SERVICIO_REQUERIMIENTO")
    @SequenceGenerator(name = "SEQ_ID_SERVICIO_REQUERIMIENTO", sequenceName = "SEQ_ID_SERVICIO_REQUERIMIENTO", allocationSize = 1)
    @Id
    @Column(name = "ID_SERVICIO_REQUERIMIENTO") Integer idServicioRequerimiento;

    @Column(name = "DESCRIPCION") private String descripcion;
    @Column(name = "COSTO") private Double costo;
    @Column(name = "PAGO") private Double pago;
    @Column(name = "SOBRA") private Double sobra;

}
