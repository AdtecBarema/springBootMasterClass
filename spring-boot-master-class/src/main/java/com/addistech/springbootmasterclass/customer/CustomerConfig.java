package com.addistech.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo; //If this value is not provided then the value would be false

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command Line Runner ");
        };
    }

    @Bean
    CustomerRepo customerRepo() {
        System.out.println("UseFakeCustomerRepo="+useFakeCustomerRepo);
        return useFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
    }
}