package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {

}