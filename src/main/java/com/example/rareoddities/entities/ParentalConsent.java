package com.example.rareoddities.entities;

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
    @JoinColumn(name = "customerid", referencedColumnName = "customerid", nullable = false)
    private Customer customer;

    @Transient
    private Long customerID;

    @ManyToOne
    @JoinColumn(name = "serviceid", referencedColumnName = "serviceid", nullable = false)
    private ShopService service;

    @Transient
    private Long serviceID;

    private boolean releaseLiability;
    private boolean confirmRelationship;
    private boolean understandsHealing;

    private String serviceDescription;
    private String parentName;
    private String parentPhone;
    private String relationship;
    private String signature;
    private String dateSigned;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public ShopService getService() {
        return service;
    }

    public void setService(ShopService service) {
        this.service = service;
    }

    public Long getServiceID() {
        return serviceID;
    }

    public void setServiceID(Long serviceID) {
        this.serviceID = serviceID;
    }

    public String getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(String dateSigned) {
        this.dateSigned = dateSigned;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public boolean isUnderstandsHealing() {
        return understandsHealing;
    }

    public void setUnderstandsHealing(boolean understandsHealing) {
        this.understandsHealing = understandsHealing;
    }

    public boolean isConfirmRelationship() {
        return confirmRelationship;
    }

    public void setConfirmRelationship(boolean confirmRelationship) {
        this.confirmRelationship = confirmRelationship;
    }

    public boolean isReleaseLiability() {
        return releaseLiability;
    }

    public void setReleaseLiability(boolean releaseLiability) {
        this.releaseLiability = releaseLiability;
    }

    public Long getIntakeID() {
        return intakeID;
    }

    public void setIntakeID(Long intakeID) {
        this.intakeID = intakeID;
    }

    public Long getParentalConsentID() {
        return parentalConsentID;
    }

    public void setParentalConsentID(Long parentalConsentID) {
        this.parentalConsentID = parentalConsentID;
    }
}
