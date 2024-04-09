package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.AttributeValue;

public interface AttributeValueRepository extends JpaRepository<AttributeValue, String> {

}