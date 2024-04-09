package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}