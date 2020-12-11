package com.kwgdev.msscbrewery.services;

import com.kwgdev.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 11:07 PM
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
