package com.example.rareoddities.services;

import com.example.rareoddities.dao.CustomerRepository;
import com.example.rareoddities.dao.ShopServiceRepository;
import com.example.rareoddities.entities.Customer;
import com.example.rareoddities.entities.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceService {

    @Autowired
    private ShopServiceRepository repository;

    @Autowired
    private CustomerRepository customerRepository;

    public List<ShopService> getAll() {
        return repository.findAll();
    }

    public ShopService save(ShopService service) {
        if (service.getCustomer() != null && service.getCustomer().getCustomerID() != null) {
            Long customerId = service.getCustomer().getCustomerID();
            Customer customer = customerRepository.findById(customerId)
                    .orElseThrow(() -> new IllegalArgumentException("Customer not found with ID: " + customerId));
            service.setCustomer(customer);
        } else {
            service.setCustomer(null); // ensure null is stored if not set
        }

        return repository.save(service);
    }


    public ShopService updateService(Long id, ShopService updatedService) {
        ShopService existing = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Service not found with ID: " + id));

        Long customerId = updatedService.getCustomer() != null ? updatedService.getCustomer().getCustomerID() : null;
        if (customerId == null) {
            throw new IllegalArgumentException("Customer is required.");
        }

        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found with ID: " + customerId));

        existing.setCustomer(customer);
        existing.setImageURL(updatedService.getImageURL());
        existing.setStatus(updatedService.getStatus());
        // Add other fields you'd like to support updating

        return repository.save(existing);
    }
}
