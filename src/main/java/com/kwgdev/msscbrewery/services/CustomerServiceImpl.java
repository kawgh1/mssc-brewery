package com.kwgdev.msscbrewery.services;

import com.kwgdev.msscbrewery.web.model.BeerDto;
import com.kwgdev.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 11:09 PM
 */
@Service
@Slf4j // logging
public class CustomerServiceImpl implements CustomerService {
    
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Rick James")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

        log.debug("Updating customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer...");

    }
}

