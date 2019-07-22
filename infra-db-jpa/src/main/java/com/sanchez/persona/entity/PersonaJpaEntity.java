package com.sanchez.persona.entity;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonaJpaEntity {
    @Id
    private String personId;
    private String tipoDocumento;
    private String nroDocumento;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoCabello;

    @Builder
    private PersonaJpaEntity(String personId, String tipoDocumento, String nroDocumento, String nombre, String apellidoPaterno, String apellidoMaterno, String tipoCabello) {
        this.personId = personId;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoCabello = tipoCabello;
    }

public Persona toDomain() {
        return Persona
                .builder()
                .documento(Documento
                        .builder()
                        .tipoDocumento(TipoDocumento.valueOf(tipoDocumento))
                        .nroDocumento(nroDocumento)
                        .build())
                .nombreCompleto(NombreCompleto
                        .builder()
                        .apellidoPaterno(apellidoPaterno)
                        .apellidoMaterno(apellidoMaterno)
                        .nombre(nombre)
                        .build())
                .tipoCabello(TipoCabello.valueOf(tipoDocumento))
                .build();
    }


    public static PersonaJpaEntity fromDomain(Persona persona) {
        return PersonaJpaEntity
                .builder()
                .apellidoMaterno(persona.nombreCompleto().apellidoMaterno())
                .apellidoPaterno(persona.nombreCompleto().apellidoPaterno())
                .nombre(persona.nombreCompleto().nombre())
                .tipoDocumento(persona.documento().tipoDocumento().toString())
                .nroDocumento(persona.documento().nroDocumento())
                .tipoCabello(persona.tipoCabello().toString())
                .build();
    }
}
