package com.example.java5nfa26sd21302.controller;

import com.example.java5nfa26sd21302.entity.Product;
import com.example.java5nfa26sd21302.service.CategoryService;
import com.example.java5nfa26sd21302.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    @GetMapping("/products")
    public String listProducts(Model model) {

        // get data from DB
        List<Product> products = productService.getAllProducts();

        // send data to view
        model.addAttribute("products", products);

        return "views/products";
    }
}
