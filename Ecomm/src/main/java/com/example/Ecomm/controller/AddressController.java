package com.example.Ecomm.controller;

import com.example.Ecomm.model.Address;
import com.example.Ecomm.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ecomm-app-address")
public class AddressController {

    @Autowired
    private IAddressService addressService;
    @PostMapping("/add-address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }
}
