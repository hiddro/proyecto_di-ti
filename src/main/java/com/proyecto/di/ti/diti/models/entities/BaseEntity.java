package com.proyecto.di.ti.diti.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity  implements Serializable {

    @Column(name = "ESTADO", length = 1) private String estado;

    @Column(name="CREACION_FECHA", updatable = false)
    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", locale = "es_PE", timezone = "America/Lima")
    @Temporal(TIMESTAMP)
    private Date fechaCreacion;

    @Column(name="ACTUALIZADO_FECHA")
    @UpdateTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", locale = "es_PE", timezone = "America/Lima")
    @Temporal(TIMESTAMP)
    private Date fechaActualizacion;
}
