package com.julucin.hrpayrolls.exceptions.factories;

import com.julucin.hrpayrolls.exceptions.WorkerDoesNotExistException;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class WorkerExceptionsFactory {

    public static WorkerDoesNotExistException makeWorkerDoesNotExistException(Long id){
        var message = "There isn't an instance of worker with ID ".concat(id.toString());
        log.info(message);
        return new WorkerDoesNotExistException(message);
    }

}
