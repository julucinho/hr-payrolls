package com.julucin.hrpayrolls.controllers;

import com.julucin.hrpayrolls.dtos.PaymentCalculationDto;
import com.julucin.hrpayrolls.dtos.PaymentDto;
import com.julucin.hrpayrolls.services.PaymentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentsController {

    private final PaymentsService paymentsService;

    @GetMapping("/worker/{workerId}/days-worked/{daysWorked}")
    public ResponseEntity<PaymentDto> getPaymentForWorker(@PathVariable Long workerId, @PathVariable Integer daysWorked){
        var paymentCalculation = PaymentCalculationDto.builder().workerId(workerId).daysWorked(daysWorked).build();
        var payment = this.paymentsService.executeCalculationOf(paymentCalculation);
        return ResponseEntity.ok(payment);
    }

}
