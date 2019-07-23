package com.sanchez.persona.entitygateway;

import com.sanchez.persona.entity.Documento;
import com.sanchez.persona.entity.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaEntityGateway {
    List<Persona> buscarTodos();

    void guardar(Persona persona);

    Optional<Persona> buscarPersona(Documento documento);
}
