package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.ShopService;
import com.example.rareoddities.services.ShopServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ShopServiceController {

    @Autowired
    private ShopServiceService shopServiceService;

    @GetMapping
    public List<ShopService> getAllServices() {
        return shopServiceService.getAll();
    }

    @PostMapping
    public ShopService addService(@RequestBody ShopService service) {
        return shopServiceService.save(service);
    }
}
