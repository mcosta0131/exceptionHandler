package com.example.exceptionHandler.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@RequiredArgsConstructor
public class ErrorResponse {

    private final int status;
    private final String message;
}
