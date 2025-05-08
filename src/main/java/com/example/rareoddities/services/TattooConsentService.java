package com.example.rareoddities.services;

import com.example.rareoddities.dao.TattooConsentRepository;
import com.example.rareoddities.entities.TattooConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TattooConsentService {
    @Autowired
    private TattooConsentRepository tattooConsentRepository;

    public TattooConsent save(TattooConsent consent) {
        return tattooConsentRepository.save(consent);
    }
}
