package com.julucin.hrpayrolls.clients.feign;

import com.julucin.hrpayrolls.dtos.WorkerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="hr-workers", path = "/workers")
public interface WorkersFeignClient {

    @GetMapping("/{id}")
    ResponseEntity<WorkerDto> retrieveById(@PathVariable Long id);

}
