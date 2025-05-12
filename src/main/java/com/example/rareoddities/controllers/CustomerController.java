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

    @GetMapping("/search")
    public List<Customer> searchCustomers(@RequestParam String name) {
        return customerService.searchByName(name);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
        updatedCustomer.setCustomerID(id);
        return customerService.save(updatedCustomer);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.delete(id);
    }
}
