package com.example.rareoddities.services;

import com.example.rareoddities.dao.ParentalConsentRepository;
import com.example.rareoddities.entities.ParentalConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentalConsentService {
    @Autowired
    private ParentalConsentRepository consentRepository;

    public ParentalConsent save(ParentalConsent consent) {
        return consentRepository.save(consent);
    }
}

