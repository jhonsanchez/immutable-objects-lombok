package com.sanchez.persona.entity;

import lombok.Builder;
import lombok.ToString;

@ToString
public final class NombreCompleto {
    private final String nombre;
    private final String apellidoPaterno;
    private final String apellidoMaterno;

    @Builder
    private NombreCompleto(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String nombre() {
        return nombre;
    }
    public String apellidoPaterno() {
        return apellidoPaterno;
    }
    public String apellidoMaterno() {
        return apellidoMaterno;
    }
}
