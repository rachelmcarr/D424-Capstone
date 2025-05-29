package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.ShopService;
import com.example.rareoddities.services.ShopServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "http://localhost:4200")
public class ShopServiceController {

    @Autowired
    private ShopServiceService service;

    @GetMapping
    public List<ShopService> getAllServices() {
        return service.getAll();
    }

    @PostMapping
    public ShopService addService(@RequestBody ShopService shopService) {
        return service.save(shopService);
    }

    @PutMapping("/{id}")
    public ShopService updateService(@PathVariable Long id, @RequestBody ShopService updatedService) {
        return service.updateService(id, updatedService);
    }

}
