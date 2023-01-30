package com.example.ordersapiapp.model.repository;

import com.example.ordersapiapp.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Integer> {

}
