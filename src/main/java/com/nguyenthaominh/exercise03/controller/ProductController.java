package com.nguyenthaominh.exercise03.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nguyenthaominh.exercise03.entity.Product;
import com.nguyenthaominh.exercise03.service.ProductService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/products")
public class ProductController {

    private ProductService productService;

    // Create Product REST API
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.createProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    // Get Product by id REST API
    // http://localhost:8080/api/products/{id}
    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") String productId) {
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    // Get All Products REST API
    // http://localhost:8080/api/products
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Update Product REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/products/{id}
    public ResponseEntity<Product> updateProduct(@PathVariable("id") String productId,
                                                  @RequestBody Product product) {
        product.setProductId(productId);
        Product updatedProduct = productService.updateProduct(product);
        if (updatedProduct != null) {
            return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete Product REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") String productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>("Product successfully deleted!", HttpStatus.OK);
    }
}
