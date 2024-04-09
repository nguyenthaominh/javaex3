package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Variant;

public interface VariantRepository extends JpaRepository<Variant, String> {

}