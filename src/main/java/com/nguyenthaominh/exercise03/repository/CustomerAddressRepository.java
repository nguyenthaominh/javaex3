package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, String> {

}