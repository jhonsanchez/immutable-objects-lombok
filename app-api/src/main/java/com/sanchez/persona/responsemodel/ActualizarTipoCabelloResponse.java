package com.sanchez.persona.responsemodel;

import lombok.Builder;
import lombok.ToString;

import javax.annotation.concurrent.Immutable;

@ToString
@Immutable
public class ActualizarTipoCabelloResponse {
    private final String mensaje;

    @Builder
    private ActualizarTipoCabelloResponse(String mensaje) {
        this.mensaje = mensaje;
    }
}
