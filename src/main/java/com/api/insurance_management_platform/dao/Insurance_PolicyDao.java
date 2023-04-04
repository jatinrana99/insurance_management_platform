package com.api.insurance_management_platform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.insurance_management_platform.dto.Insurance_Policy;
import com.api.insurance_management_platform.repository.Insurance_PolicyRepository;

@Repository
public class Insurance_PolicyDao {

    @Autowired
    Insurance_PolicyRepository insurance_PolicyRepository;

    // insert policy
    public Insurance_Policy insertPolicy(Insurance_Policy insurance_Policy){
        insurance_PolicyRepository.save(insurance_Policy);
        return insurance_Policy;
    }
    // update policy

    public Insurance_Policy updatePolicy(int policyId , Insurance_Policy insurance_Policy){
        if(insurance_PolicyRepository.findById(policyId).isPresent()){
            Insurance_Policy dbPolicy = insurance_PolicyRepository.findById(policyId).get();
            if(dbPolicy.getPolicyNumber() ==insurance_Policy.getPolicyNumber()){
            if(insurance_Policy.getPolicyType() != null && insurance_Policy.getPolicyType() != dbPolicy.getPolicyType()){
                dbPolicy.setPolicyType(insurance_Policy.getPolicyType());
            }
            if(insurance_Policy.getPolicyStartDate() != null && dbPolicy.getPolicyStartDate() != insurance_Policy.getPolicyStartDate()){
                dbPolicy.setPolicyStartDate(insurance_Policy.getPolicyStartDate());
            }
            if(insurance_Policy.getPolicyPremimum() != 0 && dbPolicy.getPolicyPremimum() != insurance_Policy.getPolicyPremimum()){
                dbPolicy.setPolicyPremimum(insurance_Policy.getPolicyPremimum());
            }
            if(insurance_Policy.getPolicyEndDate() != null && dbPolicy.getPolicyEndDate() != insurance_Policy.getPolicyEndDate()){
                dbPolicy.setPolicyEndDate(insurance_Policy.getPolicyEndDate());
            }
            if(insurance_Policy.getPolicyCoverageAmount() != 0 && dbPolicy.getPolicyCoverageAmount() != insurance_Policy.getPolicyCoverageAmount()){
                dbPolicy.setPolicyCoverageAmount(insurance_Policy.getPolicyCoverageAmount());
            }
        }
        insurance_PolicyRepository.save(dbPolicy);
            return dbPolicy;
        }
        return null;

    }

    // delete policy
    public void deletePolicy(int policyId){
        insurance_PolicyRepository.deleteById(policyId);
    }

    // display policy by id
    public Insurance_Policy displayPolicy (int policyId){
        if(insurance_PolicyRepository.findById(policyId).isPresent()){
           return insurance_PolicyRepository.findById(policyId).get();  
        }
        return null;
    }
    // display all policy
    public List<Insurance_Policy> displayPolicies(){
      return insurance_PolicyRepository.findAll();
    }

}
