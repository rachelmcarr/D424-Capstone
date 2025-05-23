package com.example.rareoddities.services;

import com.example.rareoddities.dao.TattooConsentRepository;
import com.example.rareoddities.entities.TattooConsent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TattooConsentService {

    @Autowired
    private TattooConsentRepository repository;

    public TattooConsent save(TattooConsent consent) {
        return repository.save(consent);
    }

    public List<TattooConsent> getAll() {
        return repository.findAll();
    }

    public TattooConsent getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
