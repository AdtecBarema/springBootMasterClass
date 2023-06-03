package com.addistech.springbootmasterclass.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

import java.util.List;
@Repository(value = "fake")
public class CustomerFakeRepository implements  CustomerRepo {
    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
                new Customer(100L, "Arsema Yohannes","Arsema"),
                new Customer(101L, "Hanna Addis","Addis"));
    }

    @Override
    public  Customer getCustomer(){
        //TODO
        return new Customer(10L, "New Customer ","new Password");
    }

}