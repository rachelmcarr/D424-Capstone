package com.example.rareoddities.dao;

import com.example.rareoddities.entities.Customer;
import com.example.rareoddities.entities.ParentalConsent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParentalConsentRepository extends JpaRepository<ParentalConsent, Long> {
    List<ParentalConsent> findByCustomer(Customer customer);
    List<ParentalConsent> findByCustomerCustomerID(Long customerID);
}
