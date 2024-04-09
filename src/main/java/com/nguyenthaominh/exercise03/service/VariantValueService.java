package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.VariantValue;

public interface VariantValueService {
    VariantValue createVariantValue(VariantValue variantValue);
    VariantValue getVariantValueById(String variantValueId);
    List<VariantValue> getAllVariantValues();
    VariantValue updateVariantValue(VariantValue variantValue);
    void deleteVariantValue(String variantValueId);
}