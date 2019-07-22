package com.sanchez.persona.entity;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;


public enum  TipoDocumento {
    DNI {
        @Override
        public void nroDocumentoValido(String nroDocumento) {
            checkNotNull(nroDocumento, "nro documento no puede ser nulo");
            checkArgument(nroDocumento.length() == 8,
                    "nro documento debe ser de 8 digitos, actual: '{}'",nroDocumento);
            checkArgument(nroDocumento.matches("^[0-9]+$"));
        }
    },PASAPORTE {
        @Override
        public void nroDocumentoValido(String nroDocumento) {

        }
    }, CARNE_EXTRANJERIA {
        @Override
        public void nroDocumentoValido(String nroDocumento) {

        }
    }, RUC {
        @Override
        public void nroDocumentoValido(String nroDocumento) {

        }
    };

    public abstract void nroDocumentoValido(String nroDocumento);

}
