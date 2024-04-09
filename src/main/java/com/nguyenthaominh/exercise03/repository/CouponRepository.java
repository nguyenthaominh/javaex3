package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, String> {

}