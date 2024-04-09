package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.ProductTag;

public interface ProductTagService {
    ProductTag createProductTag(ProductTag productTag);
    ProductTag getProductTagById(String productTagId);
    List<ProductTag> getAllProductTags();
    ProductTag updateProductTag(ProductTag productTag);
    void deleteProductTag(String productTagId);
}