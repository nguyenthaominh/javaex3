package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.OrderStatus;

public interface OrderStatusService {
    OrderStatus createOrderStatus(OrderStatus orderStatus);
    OrderStatus getOrderStatusById(String orderStatusId);
    List<OrderStatus> getAllOrderStatuses();
    OrderStatus updateOrderStatus(OrderStatus orderStatus);
    void deleteOrderStatus(String orderStatusId);
}