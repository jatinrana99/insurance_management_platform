package com.api.insurance_management_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.insurance_management_platform.dao.Insurance_PolicyDao;

public interface Insurance_PolicyRepository extends JpaRepository<Insurance_PolicyDao, Integer> {

}
