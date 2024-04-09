package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Supply;

public interface SupplyRepository extends JpaRepository<Supply, String> {

}