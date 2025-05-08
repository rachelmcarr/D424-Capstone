package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.TattooConsent;
import com.example.rareoddities.services.TattooConsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tattoo-consents")
public class TattooConsentController {

    @Autowired
    private TattooConsentService tattooConsentService;

    @PostMapping
    public TattooConsent addTattooConsent(@RequestBody TattooConsent consent) {
        return tattooConsentService.save(consent);
    }
}
