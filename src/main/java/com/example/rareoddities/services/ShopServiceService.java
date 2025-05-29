package com.example.rareoddities.services;

import com.example.rareoddities.dao.ShopServiceRepository;
import com.example.rareoddities.entities.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceService {

    @Autowired
    private ShopServiceRepository repository;

    public List<ShopService> getAll() {
        return repository.findAll();
    }

    public ShopService save(ShopService service) {
        return repository.save(service);
    }

    public ShopService updateService(Long id, ShopService updatedService) {
        ShopService existing = repository.findById(id).orElseThrow();
        existing.setImageURL(updatedService.getImageURL());
        existing.setStatus(updatedService.getStatus());
        // Add other fields as needed
        return repository.save(existing);
    }
}
