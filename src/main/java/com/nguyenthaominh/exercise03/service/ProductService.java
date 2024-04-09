package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product getProductById(String productId);
    List<Product> getAllProducts();
    Product updateProduct(Product product);
    void deleteProduct(String productId);
}