package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.VariantValue;

public interface VariantValueRepository extends JpaRepository<VariantValue, String> {

}