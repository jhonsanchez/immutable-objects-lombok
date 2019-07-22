package com.sanchez.persona.requestmodel;

import lombok.Getter;

@Getter
public class ActualizarTipoCabelloRequest {
    private final String tipoCabello;
    private final String tipoDocumento;
    private final String nroDocumento;

    public ActualizarTipoCabelloRequest(String tipoCabello, String tipoDocumento, String nroDocumento) {
        this.tipoCabello = tipoCabello;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
    }
}
