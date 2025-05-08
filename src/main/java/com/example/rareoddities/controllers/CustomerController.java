package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.Customer;
import com.example.rareoddities.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
