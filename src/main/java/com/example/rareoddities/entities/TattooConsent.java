package com.example.rareoddities.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class TattooConsent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tattoo_consentid")
    private Long tattooConsentID;

    private Long intakeID;

    @ManyToOne
    @JoinColumn(name = "customerid", nullable = false)
    @JsonIgnoreProperties({"services"})
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "serviceid", nullable = false, unique = true)
    @JsonIgnoreProperties({"tattooConsent"})
    private ShopService service;

    private boolean drugsOrAlcohol;
    private boolean skinCondition;
    private boolean approveDesign;
    private boolean notPregnant;
    private boolean hasDisease;
    private boolean minor;
    private boolean understandsAllergyRisk;
    private boolean understandsInfectionRisk;
    private boolean receiptOfAftercare;
    private boolean understandsVariation;
    private boolean understandsPermanence;
    private boolean understandsChoice;
    private boolean releaseArtist;
    private boolean understandsFDA;
    private boolean understandsMedicalRisk;
    private boolean agreesToAftercare;
    private boolean consentsToTattoo;
    private LocalDate dateSigned;

    @Transient
    private Long customerID;

    @Transient
    private Long serviceID;

    public Long getTattooConsentID() {
        return tattooConsentID;
    }

    public void setTattooConsentID(Long tattooConsentID) {
        this.tattooConsentID = tattooConsentID;
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

    public boolean isDrugsOrAlcohol() {
        return drugsOrAlcohol;
    }

    public void setDrugsOrAlcohol(boolean drugsOrAlcohol) {
        this.drugsOrAlcohol = drugsOrAlcohol;
    }

    public boolean isSkinCondition() {
        return skinCondition;
    }

    public void setSkinCondition(boolean skinCondition) {
        this.skinCondition = skinCondition;
    }

    public boolean isApproveDesign() {
        return approveDesign;
    }

    public void setApproveDesign(boolean approveDesign) {
        this.approveDesign = approveDesign;
    }

    public boolean isNotPregnant() {
        return notPregnant;
    }

    public void setNotPregnant(boolean notPregnant) {
        this.notPregnant = notPregnant;
    }

    public boolean isHasDisease() {
        return hasDisease;
    }

    public void setHasDisease(boolean hasDisease) {
        this.hasDisease = hasDisease;
    }

    public boolean isMinor() {
        return minor;
    }

    public void setMinor(boolean minor) {
        this.minor = minor;
    }

    public boolean isUnderstandsAllergyRisk() {
        return understandsAllergyRisk;
    }

    public void setUnderstandsAllergyRisk(boolean understandsAllergyRisk) {
        this.understandsAllergyRisk = understandsAllergyRisk;
    }

    public boolean isUnderstandsInfectionRisk() {
        return understandsInfectionRisk;
    }

    public void setUnderstandsInfectionRisk(boolean understandsInfectionRisk) {
        this.understandsInfectionRisk = understandsInfectionRisk;
    }

    public boolean isReceiptOfAftercare() {
        return receiptOfAftercare;
    }

    public void setReceiptOfAftercare(boolean receiptOfAftercare) {
        this.receiptOfAftercare = receiptOfAftercare;
    }

    public boolean isUnderstandsVariation() {
        return understandsVariation;
    }

    public void setUnderstandsVariation(boolean understandsVariation) {
        this.understandsVariation = understandsVariation;
    }

    public boolean isUnderstandsPermanence() {
        return understandsPermanence;
    }

    public void setUnderstandsPermanence(boolean understandsPermanence) {
        this.understandsPermanence = understandsPermanence;
    }

    public boolean isUnderstandsChoice() {
        return understandsChoice;
    }

    public void setUnderstandsChoice(boolean understandsChoice) {
        this.understandsChoice = understandsChoice;
    }

    public boolean isReleaseArtist() {
        return releaseArtist;
    }

    public void setReleaseArtist(boolean releaseArtist) {
        this.releaseArtist = releaseArtist;
    }

    public boolean isUnderstandsFDA() {
        return understandsFDA;
    }

    public void setUnderstandsFDA(boolean understandsFDA) {
        this.understandsFDA = understandsFDA;
    }

    public boolean isUnderstandsMedicalRisk() {
        return understandsMedicalRisk;
    }

    public void setUnderstandsMedicalRisk(boolean understandsMedicalRisk) {
        this.understandsMedicalRisk = understandsMedicalRisk;
    }

    public boolean isAgreesToAftercare() {
        return agreesToAftercare;
    }

    public void setAgreesToAftercare(boolean agreesToAftercare) {
        this.agreesToAftercare = agreesToAftercare;
    }

    public boolean isConsentsToTattoo() {
        return consentsToTattoo;
    }

    public void setConsentsToTattoo(boolean consentsToTattoo) {
        this.consentsToTattoo = consentsToTattoo;
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
