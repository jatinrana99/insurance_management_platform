package com.api.insurance_management_platform.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Insurance_Policy {

    @Id
    private int policyNumber;
    private String policyType;
    private double policyCoverageAmount;
    private String policyStartDate;
    private String policyEndDate;
    private double policyPremimum;

    @ManyToMany
    private List<Client> clients;

    @OneToMany
    private List<Claim> claims;

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Claim> getClaims() {
        return claims;
    }

    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public double getPolicyCoverageAmount() {
        return policyCoverageAmount;
    }

    public void setPolicyCoverageAmount(double policyCoverageAmount) {
        this.policyCoverageAmount = policyCoverageAmount;
    }

    public String getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(String policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public String getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(String policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public double getPolicyPremimum() {
        return policyPremimum;
    }

    public void setPolicyPremimum(double policyPremimum) {
        this.policyPremimum = policyPremimum;
    }

}
