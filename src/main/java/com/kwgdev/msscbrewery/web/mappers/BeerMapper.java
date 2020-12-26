package com.kwgdev.msscbrewery.web.mappers;

import com.kwgdev.msscbrewery.domain.Beer;
import com.kwgdev.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * created by kw on 12/26/2020 @ 2:19 AM
 */


// To view Impl go to target/generated-sources/annotations/com.kwgdev.msscbrewery.web.mappers/BeerMapperImpl
// It is auto generated using MapStruct at run time

    // allows us to earily convert from BeerDTO to Beer Pojo
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
