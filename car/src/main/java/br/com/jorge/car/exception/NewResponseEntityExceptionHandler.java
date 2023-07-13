package br.com.jorge.car.exception;

import br.com.jorge.car.entity.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class NewResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<Object> handleCarNotFoundException(CarNotFoundException ex, WebRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        String error = "Car not found. Please try a valid iD.";
        String path = request.getDescription(false);

        ErrorDetails errorDetails = new ErrorDetails(status.value(), error, path);
        return new ResponseEntity<>(errorDetails, status);
    }

    @ExceptionHandler(InvalidBrandException.class)
    public ResponseEntity<Object> handleInvalidBrandException(InvalidBrandException ex, WebRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        String error = "Invalid brand! Only Ford, Chevrolet, BMW and Volvo are allowed.";
        String path = request.getDescription(false);

        ErrorDetails errorDetails = new ErrorDetails(status.value(), error, path);
        return new ResponseEntity<>(errorDetails, status);
    }

    @ExceptionHandler(MissingFieldsException.class)
    public ResponseEntity<Object> handleMissingFieldsException(MissingFieldsException ex, WebRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        String error = "All fields are required in order to add a car. Please insert data again.";
        String path = request.getDescription(false);

        ErrorDetails errorDetails = new ErrorDetails(status.value(), error, path);
        return new ResponseEntity<>(errorDetails, status);
    }
}
