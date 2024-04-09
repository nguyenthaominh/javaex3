package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.ProductAttribute;

public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, String> {

}