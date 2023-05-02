package com.electricitybilling.electricity_billing_system_project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElectricityBillingSystemProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityBillingSystemProjectApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
