package com.sanchez.persona.responsemodel;

import lombok.Builder;
import lombok.ToString;

@ToString
public class ActualizarTipoCabelloResponse {
    private final String mensaje;

    @Builder
    private ActualizarTipoCabelloResponse(String mensaje) {
        this.mensaje = mensaje;
    }
}
