package com.sanchez.persona.interactor;

import com.sanchez.persona.boundary.ActualizarTipoCabello;
import com.sanchez.persona.entity.Documento;
import com.sanchez.persona.entity.Persona;
import com.sanchez.persona.entity.TipoCabello;
import com.sanchez.persona.entity.TipoDocumento;
import com.sanchez.persona.entitygateway.PersonaEntityGateway;
import com.sanchez.persona.requestmodel.ActualizarTipoCabelloRequest;
import com.sanchez.persona.responsemodel.ActualizarTipoCabelloResponse;

import javax.inject.Named;
import javax.transaction.Transactional;

@Named
@Transactional
public class ActualizarTipoCabelloImpl implements ActualizarTipoCabello {
    private final PersonaEntityGateway gateway;

    public ActualizarTipoCabelloImpl(PersonaEntityGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public ActualizarTipoCabelloResponse actualizar(ActualizarTipoCabelloRequest request) {
        Persona persona = gateway.buscarUno(
                Documento.builder()
                        .nroDocumento(request.getNroDocumento())
                        .tipoDocumento(TipoDocumento.valueOf(request.getTipoDocumento()))
                        .build())
                .orElseThrow(()->new IllegalArgumentException("Persona no encontrada"));

        gateway.guardar(persona
                .withTipoCabello(TipoCabello.valueOf(request.getTipoCabello())));


        return ActualizarTipoCabelloResponse.builder().mensaje("guardo correctamente").build();
    }
}
