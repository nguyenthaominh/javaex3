package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.ProductCoupon;

public interface ProductCouponRepository extends JpaRepository<ProductCoupon, String> {

}