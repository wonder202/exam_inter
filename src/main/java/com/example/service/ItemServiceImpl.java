package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Item;
import com.example.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    
    final ItemRepository itemRepository;

    @Override
    public int insertItem(Item item) {
        try{
            Item ret = itemRepository.save(item);
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
    public int deleteByPrice(Long price) {
        try {
            itemRepository.deleteById(price);
            return 1;
        }  
        catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public Item selectOneItem(Long code) {
        try {
            return itemRepository.findById(code).orElse(null);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
