package com.example.rareoddities.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class PiercingConsent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "piercing_consentid")
    private Long piercingConsentID;

    @ManyToOne
    @JoinColumn(name = "customerid", nullable = false)
    @JsonIgnoreProperties({"services"})
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "serviceid", nullable = false)
    @JsonIgnoreProperties({"piercingConsent"})
    private ShopService service;

    @OneToOne
    private ClientIntake intake;

    private Boolean understandsHealingProcess;
    private Boolean agreesToAftercare;
    private Boolean consentsToPiercing;
    private Date dateSigned;

    @Transient
    private Long customerID;

    @Transient
    private Long serviceID;

    public Long getPiercingConsentID() {
        return piercingConsentID;
    }

    public void setPiercingConsentID(Long piercingConsentID) {
        this.piercingConsentID = piercingConsentID;
    }

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

    public Boolean getUnderstandsHealingProcess() {
        return understandsHealingProcess;
    }

    public void setUnderstandsHealingProcess(Boolean understandsHealingProcess) {
        this.understandsHealingProcess = understandsHealingProcess;
    }

    public Boolean getAgreesToAftercare() {
        return agreesToAftercare;
    }

    public void setAgreesToAftercare(Boolean agreesToAftercare) {
        this.agreesToAftercare = agreesToAftercare;
    }

    public Boolean getConsentsToPiercing() {
        return consentsToPiercing;
    }

    public void setConsentsToPiercing(Boolean consentsToPiercing) {
        this.consentsToPiercing = consentsToPiercing;
    }

    public Date getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(Date dateSigned) {
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