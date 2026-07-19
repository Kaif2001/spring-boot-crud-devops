package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    // Version 2.0 Search
    public List<Product> searchProducts(String keyword,
                                        Double minPrice,
                                        Double maxPrice) {

        List<Product> products =
                repository.findByNameContainingIgnoreCase(keyword);

        if (minPrice != null) {
            products = products.stream()
                    .filter(p -> p.getPrice() >= minPrice)
                    .collect(Collectors.toList());
        }

        if (maxPrice != null) {
            products = products.stream()
                    .filter(p -> p.getPrice() <= maxPrice)
                    .collect(Collectors.toList());
        }

        if (products.isEmpty()) {
            throw new RuntimeException("No products found.");
        }

        return products;
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product removed successfully! ID: " + id;
    }

    public Product updateProduct(Product product) {

        Product existingProduct = repository.findById(product.getId()).orElse(null);

        if (existingProduct == null) {
            return null;
        }

        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());

        return repository.save(existingProduct);
    }
}