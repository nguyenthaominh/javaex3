package com.nguyenthaominh.exercise03.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.nguyenthaominh.exercise03.entity.ProductCategory;
import com.nguyenthaominh.exercise03.service.ProductCategoryService;
import com.nguyenthaominh.exercise03.repository.ProductCategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    @Override
    public ProductCategory getProductCategoryById(String productCategoryId) {
        Optional<ProductCategory> optionalProductCategory = productCategoryRepository.findById(productCategoryId);
        return optionalProductCategory.orElse(null);
    }

    @Override
    public List<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory updateProductCategory(ProductCategory productCategory) {
        Optional<ProductCategory> optionalExistingProductCategory = productCategoryRepository.findById(productCategory.getProductCategoryId());
        if (optionalExistingProductCategory.isPresent()) {
            ProductCategory existingProductCategory = optionalExistingProductCategory.get();
            existingProductCategory.setProduct(productCategory.getProduct());
            existingProductCategory.setCategory(productCategory.getCategory());

            ProductCategory updatedProductCategory = productCategoryRepository.save(existingProductCategory);
            return updatedProductCategory;
        }

        return null;
    }

    @Override
    public void deleteProductCategory(String productCategoryId) {
        productCategoryRepository.deleteById(productCategoryId);
    }
}
