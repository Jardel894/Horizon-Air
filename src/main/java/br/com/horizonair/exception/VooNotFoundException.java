package br.com.horizonair.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class VooNotFoundException extends ResponseStatusException {


    public VooNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Voo não encontrado");
    }
}