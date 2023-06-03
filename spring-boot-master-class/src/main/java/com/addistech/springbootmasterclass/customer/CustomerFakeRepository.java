package com.addistech.springbootmasterclass.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;

import java.util.List;
@Component(value = "fake")
public class CustomerFakeRepository implements  CustomerRepo {
    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
                new Customer(100L, "Arsema Yohannes"),
                new Customer(101L, "Hanna Addis"));
    }
}