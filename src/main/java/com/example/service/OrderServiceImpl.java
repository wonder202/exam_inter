package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    final OrderRepository orderRepository;
    
    @Override
    public int insertOrder(Order order) {
        try{
            Order ret = orderRepository.save(order);
            if(ret != null){
                return 1;
            }
            return 0;
        }
        catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int updateOrder(Order order) {
        try{
            orderRepository.save(order);
            return 1;
        }
        catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Order selectOneOrder(Long code) {
        try {
            return orderRepository.findById(code).orElse(null);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Order> selectOrder() {
        try {
            return orderRepository.findAll();
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
