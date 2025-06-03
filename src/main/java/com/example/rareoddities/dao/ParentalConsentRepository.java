package com.example.rareoddities.dao;

import com.example.rareoddities.entities.Customer;
import com.example.rareoddities.entities.ParentalConsent;
import com.example.rareoddities.entities.ShopService;
import com.example.rareoddities.entities.TattooConsent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ParentalConsentRepository extends JpaRepository<ParentalConsent, Long> {
    List<ParentalConsent> findByCustomer(Customer customer);
    List<ParentalConsent> findByCustomerCustomerID(Long customerID);
    Optional<ParentalConsent> findByCustomer_CustomerID(Long customerID);
    Optional<ParentalConsent> findByService(ShopService service);
}
