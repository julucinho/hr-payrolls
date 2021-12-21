package com.julucin.hrpayrolls.exceptions;

public class WorkerDoesNotExistException extends RuntimeException{

    public WorkerDoesNotExistException(String message){
        super(message);
    }

}
