package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}