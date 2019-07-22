package com.sanchez.persona.boundary;

import com.sanchez.persona.requestmodel.ActualizarTipoCabelloRequest;
import com.sanchez.persona.responsemodel.ActualizarTipoCabelloResponse;

@FunctionalInterface
@Boundary
public interface ActualizarTipoCabello {
    ActualizarTipoCabelloResponse actualizar(ActualizarTipoCabelloRequest request);
}
