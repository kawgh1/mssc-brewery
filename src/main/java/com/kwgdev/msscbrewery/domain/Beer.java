package com.kwgdev.msscbrewery.domain;

import com.kwgdev.msscbrewery.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * created by kw on 12/26/2020 @ 2:19 AM
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {


    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;

    // Timestamp is a good Date Type to use for Databases, but not for public facing components and interfaces
    // Use MapStruct to convert
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
