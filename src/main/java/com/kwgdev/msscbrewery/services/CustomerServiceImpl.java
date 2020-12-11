package com.kwgdev.msscbrewery.services;

import com.kwgdev.msscbrewery.web.model.BeerDto;
import com.kwgdev.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 11:09 PM
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Rick James")
                .build();
    }
}

