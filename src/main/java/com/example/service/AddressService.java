package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Address;

@Service
public interface AddressService {
    public int insertAddress(Address address);
}
