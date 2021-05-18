package br.com.easyfisco.service.controller.rest.handler;

import br.com.easyfisco.exception.BadRequestException;
import br.com.easyfisco.exception.MethodNotAllowedException;
import br.com.easyfisco.exception.ObjectNotFoundException;
import br.com.easyfisco.exception.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException exception, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(StandardError.builder()
            .status(HttpStatus.NOT_FOUND.value())
            .message(exception.getMessage())
            .instant(System.currentTimeMillis())
            .build());
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<StandardError> badRequestException(BadRequestException exception, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(StandardError.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(exception.getMessage())
                .instant(System.currentTimeMillis())
                .build());
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<StandardError> unauthorizedException(UnauthorizedException exception, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(StandardError.builder()
                .status(HttpStatus.UNAUTHORIZED.value())
                .message(exception.getMessage())
                .instant(System.currentTimeMillis())
                .build());
    }

    @ExceptionHandler(MethodNotAllowedException.class)
    public ResponseEntity<StandardError> methodNotAllowedException(UnauthorizedException exception, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(StandardError.builder()
                .status(HttpStatus.METHOD_NOT_ALLOWED.value())
                .message(exception.getMessage())
                .instant(System.currentTimeMillis())
                .build());
    }
}


