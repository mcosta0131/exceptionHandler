package com.example.exceptionHandler.entity;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private String productNumber;

    public Product(String productNumber) {
        this.productNumber = productNumber;
    }
}
