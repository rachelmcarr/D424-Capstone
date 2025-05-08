package com.example.rareoddities.services;

import com.example.rareoddities.dao.PiercingConsentRepository;
import com.example.rareoddities.entities.PiercingConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiercingConsentService {
    @Autowired
    private PiercingConsentRepository piercingConsentRepository;

    public PiercingConsent save(PiercingConsent consent) {
        return piercingConsentRepository.save(consent);
    }
}
