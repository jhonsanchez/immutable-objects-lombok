package com.sanchez.persona.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaJpaEntityRepository extends CrudRepository<PersonaJpaEntity,String> {
    List<PersonaJpaEntity> findAll();

    Optional<PersonaJpaEntity> findByTipoDocumentoAndNroDocumento(String tipoDoc, String nroDoc);
}
