package com.julucin.hrpayrolls.services.impl;

import com.julucin.hrpayrolls.clients.feign.WorkersFeignClient;
import com.julucin.hrpayrolls.dtos.WorkerDto;
import com.julucin.hrpayrolls.exceptions.factory.WorkerExceptionsFactory;
import com.julucin.hrpayrolls.services.WorkersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkersServiceImpl implements WorkersService {

    private final WorkersFeignClient workersFeignClient;

    @Override
    public WorkerDto retrieveWorkerBy(Long workerId) {
        var retrievementResponse = this.workersFeignClient.retrieveById(workerId);
        if (retrievementResponse.getStatusCode().equals(HttpStatus.NOT_FOUND))
            throw WorkerExceptionsFactory.makeWorkerDoesNotExistException(workerId);
        return retrievementResponse.getBody();
    }
}
