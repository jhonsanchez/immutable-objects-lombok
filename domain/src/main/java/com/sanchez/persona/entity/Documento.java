package com.sanchez.persona.entity;

import lombok.Builder;
import lombok.ToString;

import static com.google.common.base.Preconditions.checkNotNull;

@ToString
public final class Documento {
    private final TipoDocumento tipoDocumento;
    private final String nroDocumento;

    @Builder
    private Documento(TipoDocumento tipoDocumento, String nroDocumento) {
        checkNotNull(nroDocumento, "nro de documento no puede ser nulo");
        checkNotNull(tipoDocumento, "tipo de documento no puede ser nulo");
        tipoDocumento.nroDocumentoValido(nroDocumento);
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
    }

    public TipoDocumento tipoDocumento() {
        return tipoDocumento;
    }

    public String nroDocumento() {
        return nroDocumento;
    }
}
