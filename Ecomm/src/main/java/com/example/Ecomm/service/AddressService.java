package com.example.Ecomm.service;

import com.example.Ecomm.model.Address;
import com.example.Ecomm.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService implements IAddressService{

    private static List<Address> address = new ArrayList<>();

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void addAddress(Address address)
    {
        addressRepository.save(address);
    }
}
