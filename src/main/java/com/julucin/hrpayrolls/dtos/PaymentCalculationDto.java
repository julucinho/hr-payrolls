package com.julucin.hrpayrolls.dtos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentCalculationDto {

    private final Long workerId;
    private final Integer daysWorked;

}
