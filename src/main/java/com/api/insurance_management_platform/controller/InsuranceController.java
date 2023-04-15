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

import com.api.insurance_management_platform.dto.Insurance_Policy;
import com.api.insurance_management_platform.service.Insurance_PolicyService;
@RestController
public class InsuranceController {

    @Autowired
    Insurance_PolicyService policyService;

     // insert policy
     @PostMapping("/api/policies")
     public Insurance_Policy insertPolicy(@RequestBody Insurance_Policy insurance_Policy){
            return policyService.insertPolicy(insurance_Policy);
     }
 
     // update policy
     @PutMapping("/api/policies/{policyId}")
     public Insurance_Policy updatePolicy(@PathVariable int policyId ,@RequestBody Insurance_Policy insurance_Policy){
            return policyService.updatePolicy(policyId, insurance_Policy);
     }
 
     // delete policy
     @DeleteMapping("/api/policies/{policyId}")
     public void deletePolicy(@PathVariable int policyId){
        policyService.deletePolicy(policyId);
 
     }
 
     // display  policy by id 
     @GetMapping("/api/policies/{policyId}")
     public Insurance_Policy displayPolicy (@PathVariable int policyId){
        return policyService.displayPolicy(policyId);
 
     }
 
     // display all policies 
     @GetMapping("/api/policies")
     public List<Insurance_Policy> displayPolicies(){
        return policyService.displayPolicies();
         
     }
 
     
    
}
