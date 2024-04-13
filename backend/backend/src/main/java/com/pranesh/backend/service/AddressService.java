package com.pranesh.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranesh.backend.model.Address;
import com.pranesh.backend.repository.AddressRepo;

@Service
public class AddressService {
    
    @Autowired
    AddressRepo ar;

    public List<Address> getAllAddresses()
    {
        return ar.findAll();
    }
}