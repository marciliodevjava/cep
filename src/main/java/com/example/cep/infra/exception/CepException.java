package com.example.cep.infra.exception;

public class CepException extends RuntimeException {
    public CepException(){
        super();
    }

    public CepException(String mensagem){
        super(mensagem);
    }
}
