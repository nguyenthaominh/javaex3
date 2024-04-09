package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.ProductAttributeValue;

public interface ProductAttributeValueRepository extends JpaRepository<ProductAttributeValue, String> {

}