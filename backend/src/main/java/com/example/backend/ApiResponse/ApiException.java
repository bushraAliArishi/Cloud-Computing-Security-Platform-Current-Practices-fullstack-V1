package com.example.backend.ApiResponse;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}