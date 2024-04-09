package com.nguyenthaominh.exercise03.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nguyenthaominh.exercise03.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {

}