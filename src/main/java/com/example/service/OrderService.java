package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Order;

@Service
public interface OrderService {
    public int insertOrder(Order Order);

    public int updateOrder(Order order);

    public Order selectOneOrder(Long code);

    public List<Order> selectOrder();
}
