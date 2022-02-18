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
@Table(name = "SERVICIO_REQUERIMIENTO")
public class ServicioRequerimiento extends BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_SERVICIO_REQUERIMIENTO") Integer idServicioRequerimiento;

    @Column(name = "DESCRIPCION") private String descripcion;
    @Column(name = "COSTO") private Double costo;
    @Column(name = "PAGO") private Double pago;
    @Column(name = "SOBRA") private Double sobra;

    @OneToMany(mappedBy = "servicioRequerimiento", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<RegistroServicioRequerimiento> registroServicioRequerimientos;

}
