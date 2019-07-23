package com.sanchez.persona.requestmodel;


import javax.annotation.concurrent.Immutable;

@Immutable
public class ObtenerPersonaRequest {
    private final String tipoDocumento;
    private final String nroDocumento;

    public ObtenerPersonaRequest(String tipoDocumento, String nroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
    }

    public String tipoDocumento() {
        return tipoDocumento;
    }

    public String nroDocumento() {
        return nroDocumento;
    }
}
