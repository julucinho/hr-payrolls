package com.julucin.hrpayrolls.exceptions.handler;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
public class ExceptionHandlerResponse {

    static ExceptionHandlerResponse of(RuntimeException exception){
        var exceptionHandlerResponse = new ExceptionHandlerResponse();
        exceptionHandlerResponse.setMessage(exception.getMessage());
        return exceptionHandlerResponse;
    }

    private String message;
}
