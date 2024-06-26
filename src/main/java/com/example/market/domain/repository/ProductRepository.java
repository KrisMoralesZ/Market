package com.example.market.domain.repository;

import com.example.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int category);
    Optional<List<Product>> getProduct(int productId);
    Product save(Product product);
    void delete(Product product);
}
