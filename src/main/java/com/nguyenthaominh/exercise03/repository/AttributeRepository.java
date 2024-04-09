package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Attribute;

public interface AttributeRepository extends JpaRepository<Attribute, String> {

}