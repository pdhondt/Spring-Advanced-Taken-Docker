package be.vdab.renners.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RennerNietGevondenException extends RuntimeException {
    public RennerNietGevondenException() {
        super("Renner niet gevonden");
    }
}
