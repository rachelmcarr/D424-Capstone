package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.ParentalConsent;
import com.example.rareoddities.services.ParentalConsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parental-consents")
public class ParentalConsentController {

    @Autowired
    private ParentalConsentService parentalConsentService;

    @PostMapping
    public ParentalConsent addParentalConsent(@RequestBody ParentalConsent consent) {
        return parentalConsentService.save(consent);
    }
}
