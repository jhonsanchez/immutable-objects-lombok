package com.sanchez.persona.interactor;

import com.sanchez.persona.boundary.ObtenerPersona;
import com.sanchez.persona.entity.Documento;
import com.sanchez.persona.entity.Persona;
import com.sanchez.persona.entity.TipoDocumento;
import com.sanchez.persona.entitygateway.PersonaEntityGateway;
import com.sanchez.persona.requestmodel.ObtenerPersonaRequest;
import com.sanchez.persona.responsemodel.ObtenerPersonaResponse;

import javax.inject.Named;
import java.util.function.Function;

@Named
public class ObtenerPersonaImpl implements ObtenerPersona {
    private final PersonaEntityGateway gateway;

    public ObtenerPersonaImpl(PersonaEntityGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public ObtenerPersonaResponse obtenerPersona(ObtenerPersonaRequest request) {
        return gateway.buscarPersona(toDocumento(request))
                .map(toObtenerPersonaResponse())
                .orElseThrow(() -> new IllegalArgumentException("Persona no encontrada"));
    }

    private Documento toDocumento(ObtenerPersonaRequest request) {
        return Documento.builder()
                .tipoDocumento(TipoDocumento.valueOf(request.tipoDocumento()))
                .nroDocumento(request.nroDocumento())
                .build();
    }

    private Function<Persona, ObtenerPersonaResponse> toObtenerPersonaResponse() {
        return persona ->
                ObtenerPersonaResponse
                        .builder()
                        .apellidoMaterno(persona.nombreCompleto().apellidoMaterno())
                        .apellidoPaterno(persona.nombreCompleto().apellidoPaterno())
                        .nombre(persona.nombreCompleto().nombre())
                        .tipoCabello(persona.tipoCabello().toString())
                        .build();
    }

}