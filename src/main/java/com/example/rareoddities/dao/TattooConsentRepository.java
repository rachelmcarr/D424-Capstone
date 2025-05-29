package com.example.rareoddities.dao;

import com.example.rareoddities.entities.Customer;
import com.example.rareoddities.entities.TattooConsent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TattooConsentRepository extends JpaRepository<TattooConsent, Long> {
    List<TattooConsent> findByCustomer(Customer customer);
    List<TattooConsent> findByCustomerCustomerID(Long customerID);
}
