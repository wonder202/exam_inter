package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Item;

@Service
public interface ItemService {
    public int insertItem(Item item);

    public int deleteByPrice(Long price);

    public Item selectOneItem(Long code);
}
