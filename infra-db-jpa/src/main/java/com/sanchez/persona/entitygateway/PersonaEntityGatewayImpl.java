package com.sanchez.persona.entitygateway;

import com.sanchez.persona.entity.Documento;
import com.sanchez.persona.entity.Persona;
import com.sanchez.persona.entity.PersonaJpaEntity;
import com.sanchez.persona.entity.PersonaJpaEntityRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonaEntityGatewayImpl implements PersonaEntityGateway {
    private final PersonaJpaEntityRepository repository;

    public PersonaEntityGatewayImpl(PersonaJpaEntityRepository repository) {
        this.repository = repository;
    }

    public List<Persona> buscarTodos() {
        return repository
                .findAll()
                .stream()
                .map(PersonaJpaEntity::toDomain)
                .collect(Collectors.toList());
    }

    public void guardar(Persona persona) {
        repository.save(PersonaJpaEntity.fromDomain(persona));
    }

    public Optional<Persona> buscarPersona(Documento documento) {
        return repository.findByTipoDocumentoAndNroDocumento(documento.tipoDocumento().toString(),documento.nroDocumento())
                .map(PersonaJpaEntity::toDomain);
    }
}
