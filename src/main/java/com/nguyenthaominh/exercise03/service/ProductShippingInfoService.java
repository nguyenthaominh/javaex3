package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.ProductShippingInfo;

public interface ProductShippingInfoService {
    ProductShippingInfo createProductShippingInfo(ProductShippingInfo productShippingInfo);
    ProductShippingInfo getProductShippingInfoById(String productShippingInfoId);
    List<ProductShippingInfo> getAllProductShippingInfos();
    ProductShippingInfo updateProductShippingInfo(ProductShippingInfo productShippingInfo);
    void deleteProductShippingInfo(String productShippingInfoId);
}