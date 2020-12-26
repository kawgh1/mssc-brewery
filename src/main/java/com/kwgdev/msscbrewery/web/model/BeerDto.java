package com.kwgdev.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 10:29 PM
 */
// Lombok annotations - generates constructors, getters, setters, etc. at runtime
    // must enable Annotation Processors in Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;
}
