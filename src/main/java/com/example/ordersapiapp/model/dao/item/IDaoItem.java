package com.example.ordersapiapp.model.dao.item;

import com.example.ordersapiapp.model.Item;
import java.util.List;
import java.util.Optional;


public interface IDaoItem  {
    List<Item> findAll();
    Optional<Item> findById(Integer id);
    Item save(Item item);
    Item update(Item item);
    Item delete(Integer id);

}
