package com.sanchez.persona.boundary;

import com.sanchez.persona.requestmodel.ObtenerPersonaRequest;
import com.sanchez.persona.responsemodel.ObtenerPersonaResponse;

@FunctionalInterface
@Boundary
public interface ObtenerPersona {
    ObtenerPersonaResponse obtenerPersona(ObtenerPersonaRequest request);
}
