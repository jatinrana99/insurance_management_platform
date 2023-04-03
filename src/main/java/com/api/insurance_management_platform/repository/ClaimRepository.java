package com.api.insurance_management_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.insurance_management_platform.dao.ClaimDao;

public interface ClaimRepository extends JpaRepository<ClaimDao, Integer> {

}
