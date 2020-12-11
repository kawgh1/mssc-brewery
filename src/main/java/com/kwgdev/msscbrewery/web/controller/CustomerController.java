package com.kwgdev.msscbrewery.web.controller;

import com.kwgdev.msscbrewery.services.CustomerService;
import com.kwgdev.msscbrewery.web.model.BeerDto;
import com.kwgdev.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 11:05 PM
 */
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {

        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping // Post - create a new customer
    public ResponseEntity handlePost(@RequestBody CustomerDto customerDto) { // @RequestBody required or saves null

        CustomerDto savedDto = customerService.saveNewCustomer(customerDto);

        // JSON
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);

    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) { //@RequestBody required or saves null

        customerService.updateCustomer(customerId, customerDto);

        // NO_CONTENT is a 204 response means, yes server understood the request and processed, but no content to display
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId) {

        customerService.deleteById(customerId);

    }
}







