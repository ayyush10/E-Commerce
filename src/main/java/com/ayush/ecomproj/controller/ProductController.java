package com.ayush.ecomproj.controller;

import com.ayush.ecomproj.model.Product;
import com.ayush.ecomproj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProduct(id);
    }
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

}
