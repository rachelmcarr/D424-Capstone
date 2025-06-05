package com.example.rareoddities.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@MappedSuperclass
public abstract class ConsentForm {

    @ManyToOne
    @JoinColumn(name = "customerid", nullable = false)
    @JsonIgnoreProperties({"services"})
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "serviceid", nullable = false)
    @JsonIgnoreProperties({"tattooConsent", "piercingConsent", "parentalConsent"})
    private ShopService service;

    @OneToOne
    private ClientIntake intake;

    private LocalDate dateSigned;

    @Transient
    private Long customerID;

    @Transient
    private Long serviceID;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShopService getService() {
        return service;
    }

    public void setService(ShopService service) {
        this.service = service;
    }

    public ClientIntake getIntake() {
        return intake;
    }

    public void setIntake(ClientIntake intake) {
        this.intake = intake;
    }

    public LocalDate getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(LocalDate dateSigned) {
        this.dateSigned = dateSigned;
    }

    public Long getCustomerID() {
        return customerID != null ? customerID : (customer != null ? customer.getCustomerID() : null);
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Long getServiceID() {
        return serviceID != null ? serviceID : (service != null ? service.getServiceID() : null);
    }

    public void setServiceID(Long serviceID) {
        this.serviceID = serviceID;
    }
}
