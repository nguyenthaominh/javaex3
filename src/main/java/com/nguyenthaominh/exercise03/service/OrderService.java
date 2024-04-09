package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.Order;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrderById(String orderId);
    List<Order> getAllOrders();
    Order updateOrder(Order order);
    void deleteOrder(String orderId);
}