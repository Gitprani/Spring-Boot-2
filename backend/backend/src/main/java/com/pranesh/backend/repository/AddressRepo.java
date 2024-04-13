package com.pranesh.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pranesh.backend.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{
    
}