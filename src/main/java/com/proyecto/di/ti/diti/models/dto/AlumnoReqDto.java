package com.proyecto.di.ti.diti.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoReqDto implements Serializable {

    @JsonProperty(value = "IdAlumnoRequerimiento")
    private Integer IdAlumnoRequerimiento;

    @JsonProperty(value = "Apellido")
    private String Apellido;

    @JsonProperty(value = "Celular")
    private String Celular;

    @JsonProperty(value = "Correo")
    private String Correo;

    @JsonProperty(value = "Direccion")
    private String Direccion;

    @JsonProperty(value = "Dni")
    private String Dni;

    @JsonProperty(value = "Edad")
    private Integer Edad;

    @JsonProperty(value = "Genero")
    private String Genero;

    @JsonProperty(value = "Nombre")
    private String Nombre;

}
