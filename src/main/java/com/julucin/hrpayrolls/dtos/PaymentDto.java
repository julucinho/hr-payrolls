package com.julucin.hrpayrolls.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDto {

    private WorkerDto worker;
    private Integer daysWorked;
    private Double income;

}