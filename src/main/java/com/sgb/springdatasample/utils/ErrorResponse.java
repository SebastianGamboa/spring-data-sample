package com.sgb.springdatasample.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Sebastián Gamboa
 */
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {

    private int status;
    private String message;
}