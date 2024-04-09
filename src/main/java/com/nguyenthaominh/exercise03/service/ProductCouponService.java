package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.ProductCoupon;

public interface ProductCouponService {
    ProductCoupon createProductCoupon(ProductCoupon productCoupon);
    ProductCoupon getProductCouponById(String productCouponId);
    List<ProductCoupon> getAllProductCoupons();
    ProductCoupon updateProductCoupon(ProductCoupon productCoupon);
    void deleteProductCoupon(String productCouponId);
}