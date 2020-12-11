package com.kwgdev.msscbrewery.services;

import com.kwgdev.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 10:37 PM
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
