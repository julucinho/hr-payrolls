package com.julucin.hrpayrolls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HrPayrollsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollsApplication.class, args);
	}

}
