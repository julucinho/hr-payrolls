package com.julucin.hrpayrolls.services;

import com.julucin.hrpayrolls.dtos.WorkerDto;
import org.springframework.stereotype.Service;

@Service
public interface WorkersService {

    WorkerDto retrieveWorkerBy(Long workerId);

}
