package com.sanchez.persona.interactor;

import com.sanchez.persona.boundary.ObtenerPersona;
import com.sanchez.persona.entitygateway.PersonaEntityGateway;
import com.sanchez.persona.requestmodel.ObtenerPersonaRequest;
import com.sanchez.persona.responsemodel.ObtenerPersonaResponse;

import javax.inject.Named;

@Named
public class ObtenerPersonaImpl implements ObtenerPersona {
    private final PersonaEntityGateway gateway;

    public ObtenerPersonaImpl(PersonaEntityGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public ObtenerPersonaResponse obtenerPersona(ObtenerPersonaRequest request) {

//        return gateway.buscarUno();
    }
}
