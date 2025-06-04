package com.example.rareoddities.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "parental_consents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParentalConsent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parental_consentid")
    private Long parentalConsentID;

    private Long intakeID;

    @ManyToOne
    @JoinColumn(name = "customerid", nullable = false)
    @JsonIgnoreProperties({"services"})
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "serviceid", nullable = false)
    @JsonIgnoreProperties({"parentalConsent"})
    private ShopService service;

    private boolean releaseLiability;
    private boolean confirmRelationship;
    private boolean understandsHealing;

    private String serviceDescription;
    private String parentName;
    private String parentPhone;
    private String relationship;
    private String signature;
    private String dateSigned;

    public Long getParentalConsentID() {
        return parentalConsentID;
    }

    public void setParentalConsentID(Long parentalConsentID) {
        this.parentalConsentID = parentalConsentID;
    }

    public Long getIntakeID() {
        return intakeID;
    }

    public void setIntakeID(Long intakeID) {
        this.intakeID = intakeID;
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

    public boolean isReleaseLiability() {
        return releaseLiability;
    }

    public void setReleaseLiability(boolean releaseLiability) {
        this.releaseLiability = releaseLiability;
    }

    public boolean isConfirmRelationship() {
        return confirmRelationship;
    }

    public void setConfirmRelationship(boolean confirmRelationship) {
        this.confirmRelationship = confirmRelationship;
    }

    public boolean isUnderstandsHealing() {
        return understandsHealing;
    }

    public void setUnderstandsHealing(boolean understandsHealing) {
        this.understandsHealing = understandsHealing;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(String dateSigned) {
        this.dateSigned = dateSigned;
    }

    @Transient
    private Long customerID;

    @Transient
    private Long serviceID;

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