package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Integer> {

}