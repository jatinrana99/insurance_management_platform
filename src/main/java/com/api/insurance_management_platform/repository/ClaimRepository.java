package com.api.insurance_management_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.insurance_management_platform.dto.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
