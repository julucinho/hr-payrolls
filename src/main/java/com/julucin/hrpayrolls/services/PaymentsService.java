package com.julucin.hrpayrolls.services;

import com.julucin.hrpayrolls.dtos.PaymentCalculationDto;
import com.julucin.hrpayrolls.dtos.PaymentDto;
import org.springframework.stereotype.Service;

@Service
public interface PaymentsService {

    PaymentDto executeCalculationOf(PaymentCalculationDto paymentCalculation);

}
