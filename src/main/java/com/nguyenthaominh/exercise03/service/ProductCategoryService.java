package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.ProductCategory;

public interface ProductCategoryService {
    ProductCategory createProductCategory(ProductCategory productCategory);
    ProductCategory getProductCategoryById(String productCategoryId);
    List<ProductCategory> getAllProductCategories();
    ProductCategory updateProductCategory(ProductCategory productCategory);
    void deleteProductCategory(String productCategoryId);
}