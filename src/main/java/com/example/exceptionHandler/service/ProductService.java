package com.example.exceptionHandler.service;

import com.example.exceptionHandler.entity.Product;
import com.example.exceptionHandler.exception.NoSuchElementFoundException;
import com.example.exceptionHandler.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public Product getProduct(String id) {
        return repository.findById(id).orElseThrow(() ->
                new NoSuchElementFoundException("Item not found"));
    }
}
