package com.example.java5nfa26sd21302.service;

import com.example.java5nfa26sd21302.entity.Product;
import com.example.java5nfa26sd21302.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }
}

