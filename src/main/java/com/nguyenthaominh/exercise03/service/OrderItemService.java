package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.OrderItem;

public interface OrderItemService {
    OrderItem createOrderItem(OrderItem orderItem);
    OrderItem getOrderItemById(String orderItemId);
    List<OrderItem> getAllOrderItems();
    OrderItem updateOrderItem(OrderItem orderItem);
    void deleteOrderItem(String orderItemId);
}