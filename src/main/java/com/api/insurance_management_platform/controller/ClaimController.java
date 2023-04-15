package com.api.insurance_management_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.insurance_management_platform.dto.Claim;
import com.api.insurance_management_platform.service.ClaimService;

@RestController
public class ClaimController {
    
    @Autowired
    ClaimService claimService;

    // insert claim
    @PostMapping("/api/claims")
    public Claim insertClaim(@RequestBody Claim claim) {
        return claimService.insertClaim(claim);
    }


    // update claim
    @PutMapping("/api/claims/{claimId}")
    public Claim updateClaim(@PathVariable int claimId, @RequestBody Claim claim) {
        return claimService.updateClaim(claimId, claim);
    }

    // delete claim
    @DeleteMapping("/api/claims/{cliamId}")
    public void deleteClaim(@PathVariable int claimId) {
        claimService.deleteClaim(claimId);
    }

    // display claim by id
    @GetMapping("/api/claims/{id}")
    public Claim diplayClaim(@PathVariable int claimId) {
        return diplayClaim(claimId);
    }

    // display all claim
    @GetMapping("/api/claims")
    public List<Claim> displayClaims() {
        return claimService.displayClaims();
    }

}
