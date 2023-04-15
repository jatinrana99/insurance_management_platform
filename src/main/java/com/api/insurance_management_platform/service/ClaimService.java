package com.api.insurance_management_platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.insurance_management_platform.dao.ClaimDao;
import com.api.insurance_management_platform.dto.Claim;

@Service
public class ClaimService {

    @Autowired
    ClaimDao claimDao;

    // insert claim
    public Claim insertClaim(Claim claim) {
        if (claim.getInsurance_Policy().getPolicyNumber() > 0) {
            return claimDao.insertClaim(null);
        }
        return null;

    }

    // update claim
    public Claim updateClaim(int claimId, Claim claim) {
        return claimDao.updateClaim(claimId, claim);
    }

    // delete claim
    public void deleteClaim(int claimId) {
        claimDao.deleteClaim(claimId);
    }

    // display claim by id
    public Claim diplayClaim(int claimId) {
        return claimDao.diplayClaim(claimId);
    }

    // display all claim
    public List<Claim> displayClaims() {
        return claimDao.displayClaims();
    }

}
