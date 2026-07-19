package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    // Health Check API
    @GetMapping("/health")
    public String healthCheck() {
        return "Application is running successfully!";
    }

    // Add Single Product
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product product) {
        return service.saveProduct(product);
    }

    // Add Multiple Products
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    // Get All Products
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    // Search Products
    @GetMapping("/products/search")
    public List<Product> searchProducts(@RequestParam String keyword) {
        return service.searchProducts(keyword);
    }

    // Get Product By ID
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    // Get Product By Name
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    // Update Product
    @PutMapping("/update")
    public Product updateProduct(@Valid @RequestBody Product product) {
        return service.updateProduct(product);
    }

    // Delete Product
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}