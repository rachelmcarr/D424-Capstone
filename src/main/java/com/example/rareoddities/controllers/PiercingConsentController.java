package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.PiercingConsent;
import com.example.rareoddities.services.PiercingConsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/piercing-consents")
public class PiercingConsentController {

    @Autowired
    private PiercingConsentService piercingConsentService;

    @PostMapping
    public PiercingConsent addPiercingConsent(@RequestBody PiercingConsent consent) {
        return piercingConsentService.save(consent);
    }
}
