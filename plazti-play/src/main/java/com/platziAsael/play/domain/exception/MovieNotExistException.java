package com.platziAsael.play.domain.exception;

public class MovieNotExistException extends RuntimeException {

    public MovieNotExistException(long id) {

        super("Pelicula no existe, id: " + id);
    }
}
