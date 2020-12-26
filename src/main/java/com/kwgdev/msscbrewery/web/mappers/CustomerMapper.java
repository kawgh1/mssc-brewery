package com.kwgdev.msscbrewery.web.mappers;

import com.kwgdev.msscbrewery.domain.Beer;
import com.kwgdev.msscbrewery.domain.Customer;
import com.kwgdev.msscbrewery.web.model.BeerDto;
import com.kwgdev.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * created by kw on 12/26/2020 @ 2:25 AM
 */
// To view Impl go to target/generated-sources/annotations/com.kwgdev.msscbrewery.web.mappers/CustomerMapperImpl
// It is auto generated using MapStruct at run time

// allows us to earily convert from CustomerDTO to Customer Pojo
@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
