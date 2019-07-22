package com.sanchez.persona.entity;

import lombok.Builder;
import lombok.ToString;
import lombok.experimental.Wither;

import static com.google.common.base.Preconditions.checkNotNull;

@ToString
public final class Persona {
    private final Documento documento;
    @Wither
    private final NombreCompleto nombreCompleto;
    @Wither
    private final TipoCabello tipoCabello;

    @Builder
    private Persona(Documento documento, NombreCompleto nombreCompleto, TipoCabello tipoCabello) {
        checkNotNull(documento, "Documento no puede ser nulo");
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.tipoCabello = tipoCabello;
    }

    public Documento documento() {
        return documento;
    }

    public NombreCompleto nombreCompleto() {
        return nombreCompleto;
    }

    public TipoCabello tipoCabello() {
        return tipoCabello;
    }
}