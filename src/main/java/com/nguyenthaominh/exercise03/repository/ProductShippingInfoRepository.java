package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.ProductShippingInfo;

public interface ProductShippingInfoRepository extends JpaRepository<ProductShippingInfo, String> {

}