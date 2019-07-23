package com.sanchez.persona.responsemodel;

import lombok.Builder;

public class ObtenerPersonaResponse {
    private final String nombre;
    private final String apellidoPaterno;
    private final String apellidoMaterno;
    private final String tipoCabello;

    @Builder
    private ObtenerPersonaResponse(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoCabello) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoCabello = tipoCabello;
    }

}
