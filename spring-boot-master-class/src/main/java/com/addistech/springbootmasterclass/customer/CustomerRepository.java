package com.addistech.springbootmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers(){
        //TODO connect to real DB
        return Collections.singletonList(new Customer(100L,"Todo implement real DB","todo","email"));
    }
    @Override
    public  Customer getCustomer(){
        //TODO
        return new Customer(10L, "New Customer ","new Password","email");
    }
}