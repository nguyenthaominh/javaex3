package com.nguyenthaominh.exercise03.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.nguyenthaominh.exercise03.entity.Product;
import com.nguyenthaominh.exercise03.service.ProductService;
import com.nguyenthaominh.exercise03.repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(String productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        return optionalProduct.orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
        Optional<Product> optionalExistingProduct = productRepository.findById(product.getProductId());
        if (optionalExistingProduct.isPresent()) {
            Product existingProduct = optionalExistingProduct.get();
            existingProduct.setSlug(product.getSlug());
            existingProduct.setProductName(product.getProductName());
            existingProduct.setSku(product.getSku());
            existingProduct.setSalePrice(product.getSalePrice());
            existingProduct.setComparePrice(product.getComparePrice());
            existingProduct.setBuyingPrice(product.getBuyingPrice());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setShortDescription(product.getShortDescription());
            existingProduct.setProductDescription(product.getProductDescription());
            existingProduct.setProductType(product.getProductType());
            existingProduct.setPublished(product.isPublished());
            existingProduct.setDisableOutOfStock(product.isDisableOutOfStock());
            existingProduct.setNote(product.getNote());
            existingProduct.setUpdatedAt(LocalDateTime.now());

            Product updatedProduct = productRepository.save(existingProduct);
            return updatedProduct;
        }

        return null;
    }

    @Override
    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }
}
