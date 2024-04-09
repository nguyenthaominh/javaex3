package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Sell;

public interface SellRepository extends JpaRepository<Sell, String> {

}