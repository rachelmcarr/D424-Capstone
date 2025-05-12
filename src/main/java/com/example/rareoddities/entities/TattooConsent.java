package com.example.rareoddities.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class TattooConsent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long intakeID;

    private boolean drugsOrAlcohol;
    private boolean skinCondition;
    private boolean approveDesign;
    private boolean isNotPregnant;
    private boolean hasDisease;
    private boolean isMinor;
    private boolean understandsAllergyRisk;
    private boolean undertandsInfectionRisk;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIntakeID() {
        return intakeID;
    }

    public void setIntakeID(Long intakeID) {
        this.intakeID = intakeID;
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
        return isNotPregnant;
    }

    public void setNotPregnant(boolean notPregnant) {
        isNotPregnant = notPregnant;
    }

    public boolean isHasDisease() {
        return hasDisease;
    }

    public void setHasDisease(boolean hasDisease) {
        this.hasDisease = hasDisease;
    }

    public boolean isMinor() {
        return isMinor;
    }

    public void setMinor(boolean minor) {
        isMinor = minor;
    }

    public boolean isUnderstandsAllergyRisk() {
        return understandsAllergyRisk;
    }

    public void setUnderstandsAllergyRisk(boolean understandsAllergyRisk) {
        this.understandsAllergyRisk = understandsAllergyRisk;
    }

    public boolean isUndertandsInfectionRisk() {
        return undertandsInfectionRisk;
    }

    public void setUndertandsInfectionRisk(boolean undertandsInfectionRisk) {
        this.undertandsInfectionRisk = undertandsInfectionRisk;
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
}
