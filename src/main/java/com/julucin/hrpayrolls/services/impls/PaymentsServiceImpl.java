package com.julucin.hrpayrolls.services.impls;

import com.julucin.hrpayrolls.dtos.PaymentCalculationDto;
import com.julucin.hrpayrolls.dtos.PaymentDto;
import com.julucin.hrpayrolls.dtos.WorkerDto;
import com.julucin.hrpayrolls.exceptions.NullIdException;
import com.julucin.hrpayrolls.services.PaymentsService;
import com.julucin.hrpayrolls.services.WorkersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static java.util.Optional.ofNullable;

@Service
@RequiredArgsConstructor
public class PaymentsServiceImpl implements PaymentsService {

    private final WorkersService workersService;

    @Override
    public PaymentDto executeCalculationOf(PaymentCalculationDto paymentCalculation) {
        var worker = this.findWorkerFor(paymentCalculation);
        var income = worker.getDailyIncome() * paymentCalculation.getDaysWorked();
        return PaymentDto.builder()
                .daysWorked(paymentCalculation.getDaysWorked())
                .totalIncome(income)
                .worker(worker)
                .build();
    }

    private WorkerDto findWorkerFor(PaymentCalculationDto paymentCalculation) {
        var workerId = ofNullable(paymentCalculation.getWorkerId()).orElseThrow(NullIdException::new);
        return this.workersService.retrieveWorkerBy(workerId);
    }
}
