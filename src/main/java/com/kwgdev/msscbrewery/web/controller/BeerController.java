package com.kwgdev.msscbrewery.web.controller;

import com.kwgdev.msscbrewery.services.BeerService;
import com.kwgdev.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 10:33 PM
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping // POST - create a new beer
    public ResponseEntity handlePost(@Valid @RequestBody BeerDto beerDto) { // @RequestBody required or saves null

        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        //JSON
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDto beerDto) { // @RequestBody required or saves null

        beerService.updateBeer(beerId, beerDto);

        // NO_CONTENT is a 204 response means, yes server understood the request and processed, but no content to display
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
//    @ResponseStatus(HttpStatus.BAD_GATEWAY) // test to show brewery client delete method is working
    @ResponseStatus(HttpStatus.OK)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {

        beerService.deleteById(beerId);

    }



}
