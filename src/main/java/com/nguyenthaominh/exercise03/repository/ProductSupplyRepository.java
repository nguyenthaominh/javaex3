package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.ProductSupply;

public interface ProductSupplyRepository extends JpaRepository<ProductSupply, String> {

}