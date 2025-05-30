package com.example.rareoddities.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class PiercingConsent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "piercing_consentid")
    private Long piercingConsentID;

    @ManyToOne
    @JoinColumn(name = "customerid", referencedColumnName = "customerid", nullable = false)
    private Customer customer;

    @Transient
    private Long customerID;

    @OneToOne
    private ClientIntake intake;

    private Boolean understandsHealingProcess;
    private Boolean agreesToAftercare;
    private Boolean consentsToPiercing;
    private Date dateSigned;

    public PiercingConsent() {
    }

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

    public Long getPiercingConsentID() {
        return piercingConsentID;
    }

    public void setPiercingConsentID(Long piercingConsentID) {
        this.piercingConsentID = piercingConsentID;
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
}

