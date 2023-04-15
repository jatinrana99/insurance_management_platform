package com.api.insurance_management_platform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.insurance_management_platform.dto.Claim;
import com.api.insurance_management_platform.repository.ClaimRepository;

@Repository
public class ClaimDao {

    @Autowired
    ClaimRepository claimRepository;

    // insert claim------------------------------------------------------------------------------------------------------------------------------------------------------------------  
    public Claim insertClaim(Claim claim) {
        if (claim.getInsurance_Policy().getPolicyNumber()>0){
        claimRepository.save(claim);
        return claim;
        }
        return null;
    }

    // update claim----------------------------------------------------------------------------------------------------------------------------------------------------------------
    public Claim updateClaim(int claimId, Claim claim){
        if(claimRepository.findById(claimId).isPresent()){
           Claim dbClaim =  claimRepository.findById(claimId).get();
           if(dbClaim.getClaimNumber() == claim.getClaimNumber()){
            // to check if user pass claim no. is equal to database claim no.
           if(claim.getClaimStatus()!=null && dbClaim.getClaimStatus() != claim.getClaimStatus()){
            dbClaim.setClaimStatus(claim.getClaimStatus());
           }
           if(claim.getClaimDescription()!= null && dbClaim.getClaimDescription() != claim.getClaimDescription()){
            dbClaim.setClaimDescription(claim.getClaimDescription());
           }
           if(claim.getClaimDate()!=null && dbClaim.getClaimDate() != claim.getClaimDate()){
            dbClaim.setClaimDate(claim.getClaimDate());
           }
           claimRepository.save(dbClaim);
           return dbClaim;
        }
    }
        return null;
    }



    // delete claim--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void deleteClaim(int claimId) {

        claimRepository.deleteById(claimId);
    }

    // display claim by Id----------------------------------------------------------------------------------------------------------------------------------------------------------------

    public Claim diplayClaim(int claimId){
        if(claimRepository.findById(claimId).isPresent()){
                return claimRepository.findById(claimId).get();
        }
        return null;
    }

    // display all claim----------------------------------------------------------------------------------------------------------------------------------------------------------------
        public List<Claim> displayClaims(){
            return claimRepository.findAll();
        }

}
