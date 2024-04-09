package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.ShippingRate;

public interface ShippingRateRepository extends JpaRepository<ShippingRate, String> {

}