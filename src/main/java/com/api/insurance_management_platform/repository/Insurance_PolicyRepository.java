package com.api.insurance_management_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.insurance_management_platform.dto.Insurance_Policy;

public interface Insurance_PolicyRepository extends JpaRepository<Insurance_Policy, Integer> {

}
