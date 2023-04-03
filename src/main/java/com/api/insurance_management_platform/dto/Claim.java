package com.api.insurance_management_platform.dto;

import java.text.DateFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Claim {

    @Id
    private int claimNumber;
    private DateFormat claimDate;
    private String claimStatus;
    private String claimDescription;

    @ManyToOne
    private Insurance_Policy insurance_Policy;

    public Insurance_Policy getInsurance_Policy() {
        return insurance_Policy;
    }

    public void setInsurance_Policy(Insurance_Policy insurance_Policy) {
        this.insurance_Policy = insurance_Policy;
    }

    public int getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(int claimNumber) {
        this.claimNumber = claimNumber;
    }

    public DateFormat getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(DateFormat claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getClaimDescription() {
        return claimDescription;
    }

    public void setClaimDescription(String claimDescription) {
        this.claimDescription = claimDescription;
    }

}
