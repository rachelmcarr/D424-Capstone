package com.example.rareoddities.dao;

import com.example.rareoddities.entities.Customer;
import com.example.rareoddities.entities.PiercingConsent;
import com.example.rareoddities.entities.TattooConsent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PiercingConsentRepository extends JpaRepository<PiercingConsent, Long> {
    List<PiercingConsent> findByCustomer(Customer customer);
    List<PiercingConsent> findByCustomerCustomerID(Long customerID);
}
