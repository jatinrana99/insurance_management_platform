package com.api.insurance_management_platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.insurance_management_platform.dao.ClientDao;

public interface ClientRepository extends JpaRepository<ClientDao, Integer> {

}
