package com.julucin.hrpayrolls.exceptions;

public class NullIdException extends RuntimeException{

    public NullIdException(){
        super("The ID was null.");
    }

}
