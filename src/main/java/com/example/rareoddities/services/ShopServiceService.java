package com.example.rareoddities.services;

import com.example.rareoddities.dao.ShopServiceRepository;
import com.example.rareoddities.entities.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceService {
    @Autowired
    private ShopServiceRepository shopServiceRepository;

    public List<ShopService> getAll() {
        return shopServiceRepository.findAll();
    }

    public ShopService save(ShopService service) {
        return shopServiceRepository.save(service);
    }
}
