package com.addistech.springbootmasterclass.customer;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping("/")
    public void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("POST request..." + customer);
    }

    @PutMapping("/")
    public void updateCustomer(@RequestBody @Valid  Customer customer) {
        System.out.println("Put Update customer request... "+customer);
    }

    @DeleteMapping(path = "{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("Delete Customer with Id: " + id);
    }

}