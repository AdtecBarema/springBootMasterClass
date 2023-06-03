package com.addistech.springbootmasterclass.customer;

import java.util.List;

public interface CustomerRepo {

    List<Customer> getCustomers();
    Customer getCustomer();

}
