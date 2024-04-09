package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.ShippingCountry;

public interface ShippingCountryService {
    ShippingCountry createShippingCountry(ShippingCountry product);
    ShippingCountry getShippingCountryById(String productId);
    List<ShippingCountry> getAllShippingCountrys();
    ShippingCountry updateShippingCountry(ShippingCountry product);
    void deleteShippingCountry(String productId);
}