package com.api.insurance_management_platform.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Client {

    @Id
    private int clientId;
    private String clientName;
    private long clientContact;
    private String clientAddress;
    private String clientDOB;

    @ManyToMany
    private List<Insurance_Policy> insurance_Policies;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public long getClientContact() {
        return clientContact;
    }

    public void setClientContact(long clientContact) {
        this.clientContact = clientContact;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientDOB() {
        return clientDOB;
    }

    public void setClientDOB(String clientDOB) {
        this.clientDOB = clientDOB;
    }

    public List<Insurance_Policy> getInsurance_Policies() {
        return insurance_Policies;
    }

    public void setInsurance_Policies(List<Insurance_Policy> insurance_Policies) {
        this.insurance_Policies = insurance_Policies;
    }

}