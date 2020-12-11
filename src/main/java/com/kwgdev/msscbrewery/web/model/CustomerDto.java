package com.kwgdev.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * created by kw on 12/10/2020 @ 11:04 PM
 */
// Lombok annotations - generates constructors, getters, setters, etc. at runtime
// must enable Annotation Processors in Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private UUID id;
    private String name;

}

