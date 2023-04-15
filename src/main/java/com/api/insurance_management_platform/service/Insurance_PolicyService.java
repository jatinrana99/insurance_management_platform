package com.api.insurance_management_platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.insurance_management_platform.dao.Insurance_PolicyDao;
import com.api.insurance_management_platform.dto.Insurance_Policy;

@Service
public class Insurance_PolicyService {

    @Autowired
    Insurance_PolicyDao policyDao;

    // insert policy
    public Insurance_Policy insertPolicy(Insurance_Policy insurance_Policy){
            return policyDao.insertPolicy(insurance_Policy);
    }

    // update policy

    public Insurance_Policy updatePolicy(int policyId , Insurance_Policy insurance_Policy){
            return policyDao.updatePolicy(policyId, insurance_Policy);
    }

    // delete policy

    public void deletePolicy(int policyId){
        policyDao.deletePolicy(policyId);

    }

    // display  policy by id 
    public Insurance_Policy displayPolicy (int policyId){
        return policyDao.displayPolicy(policyId);

    }

    // display all policies 

    public List<Insurance_Policy> displayPolicies(){
        return policyDao.displayPolicies();
    }

    
}
