package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.repository.AddressRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{

    final AddressRepository addressRepository;
    
    @Override
    public int insertAddress(Address address) {
        
        try{
            Address ret = addressRepository.save(address);
            if(ret != null){
                return 1;
            }
            return 0;
        }
        catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
