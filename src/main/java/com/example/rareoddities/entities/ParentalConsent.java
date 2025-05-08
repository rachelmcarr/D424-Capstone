package com.example.rareoddities.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class ParentalConsent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consentID;

    @OneToOne
    private ClientIntake intake;

    private String parentName;
    private String parentPhone;
    private String relationship;
    private String signature;
    private Date dateSigned;

    public ParentalConsent() {
    }

    public Long getConsentID() {
        return consentID;
    }

    public void setConsentID(Long consentID) {
        this.consentID = consentID;
    }

    public ClientIntake getIntake() {
        return intake;
    }

    public void setIntake(ClientIntake intake) {
        this.intake = intake;
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

    public Date getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(Date dateSigned) {
        this.dateSigned = dateSigned;
    }
}
