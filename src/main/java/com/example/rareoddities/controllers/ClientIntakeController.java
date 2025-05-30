package com.example.rareoddities.controllers;

import com.example.rareoddities.dao.CustomerRepository;
import com.example.rareoddities.entities.ClientIntake;
import com.example.rareoddities.entities.Customer;
import com.example.rareoddities.services.ClientIntakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client-intakes")
public class ClientIntakeController {

    private final ClientIntakeService clientIntakeService;
    private final CustomerRepository customerRepository;

    public ClientIntakeController(ClientIntakeService clientIntakeService, CustomerRepository customerRepository) {
        this.clientIntakeService = clientIntakeService;
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<ClientIntake> getAllIntakes() {
        return clientIntakeService.getAll();
    }

    @GetMapping("/customer/{id}")
    public List<ClientIntake> getByCustomerId(@PathVariable Long id) {
        return clientIntakeService.findByCustomerId(id);
    }

    @PostMapping
    public ResponseEntity<ClientIntake> addIntake(@RequestBody ClientIntake intake) {
        if (intake.getCustomer() != null && intake.getCustomer().getCustomerID() != null) {
            Customer customer = customerRepository.findById(intake.getCustomer().getCustomerID())
                    .orElseThrow(() -> new RuntimeException("Customer not found"));
            intake.setCustomer(customer);
        }
        ClientIntake saved = clientIntakeService.save(intake);
        return ResponseEntity.ok(saved);
    }
}

