package com.example.rareoddities.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class TattooConsent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tattooConsentID;

    @OneToOne
    private ClientIntake intake;

    private Boolean understandsPainRisk;
    private Boolean agreesToAftercare;
    private Boolean consentsToTattoo;
    private Date dateSigned;

    public TattooConsent() {
    }

    public Long getTattooConsentID() {
        return tattooConsentID;
    }

    public void setTattooConsentID(Long tattooConsentID) {
        this.tattooConsentID = tattooConsentID;
    }

    public ClientIntake getIntake() {
        return intake;
    }

    public void setIntake(ClientIntake intake) {
        this.intake = intake;
    }

    public Boolean getUnderstandsPainRisk() {
        return understandsPainRisk;
    }

    public void setUnderstandsPainRisk(Boolean understandsPainRisk) {
        this.understandsPainRisk = understandsPainRisk;
    }

    public Boolean getAgreesToAftercare() {
        return agreesToAftercare;
    }

    public void setAgreesToAftercare(Boolean agreesToAftercare) {
        this.agreesToAftercare = agreesToAftercare;
    }

    public Boolean getConsentsToTattoo() {
        return consentsToTattoo;
    }

    public void setConsentsToTattoo(Boolean consentsToTattoo) {
        this.consentsToTattoo = consentsToTattoo;
    }

    public Date getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(Date dateSigned) {
        this.dateSigned = dateSigned;
    }
}
