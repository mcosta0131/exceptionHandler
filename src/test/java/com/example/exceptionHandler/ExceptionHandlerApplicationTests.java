package com.example.exceptionHandler;

import com.example.exceptionHandler.entity.Product;
import com.example.exceptionHandler.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExceptionHandlerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ProductRepository repository;

	@Test
	void insert(){
		repository.insert(new Product("1"));
	}
}
