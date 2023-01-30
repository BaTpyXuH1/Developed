package com.example.ordersapiapp.model.dao.item;

import com.example.ordersapiapp.model.Item;
import com.example.ordersapiapp.model.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DbDaoItem implements IDaoItem{

    @Autowired
    private ItemRepository repository;
    @Override
    public List<Item> findAll() {
        return (List<Item>)repository.findAll();
    }

    @Override
    public Optional<Item> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Item save(Item item) {
        return repository.save(item);
    }

    @Override
    public Item update(Item item) {
        if (repository.findById(item.getId()).isPresent()) {
           return repository.save(item);

        }
        return null;
    }

    @Override
    public Item delete(Integer id) {
        return null;
    }
}
