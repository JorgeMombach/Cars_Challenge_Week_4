package br.com.jorge.car.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidBrandException extends RuntimeException{
    public InvalidBrandException(String msg){
        super (msg);
    }
}
