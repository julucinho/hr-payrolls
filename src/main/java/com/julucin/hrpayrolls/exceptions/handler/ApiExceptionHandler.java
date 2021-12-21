package com.julucin.hrpayrolls.exceptions.handler;

import com.julucin.hrpayrolls.exceptions.NullIdException;
import com.julucin.hrpayrolls.exceptions.WorkerDoesNotExistException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {WorkerDoesNotExistException.class, NullIdException.class})
    public ResponseEntity<ExceptionHandlerResponse> handle(RuntimeException exception){
        return ResponseEntity.status(400).body(ExceptionHandlerResponse.of(exception));
    }

}
