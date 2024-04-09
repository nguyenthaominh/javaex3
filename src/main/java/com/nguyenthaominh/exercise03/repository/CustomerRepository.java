package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}